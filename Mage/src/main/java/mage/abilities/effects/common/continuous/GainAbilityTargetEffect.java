/*
 * Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are
 * permitted provided that the following conditions are met:
 *
 *    1. Redistributions of source code must retain the above copyright notice, this list of
 *       conditions and the following disclaimer.
 *
 *    2. Redistributions in binary form must reproduce the above copyright notice, this list
 *       of conditions and the following disclaimer in the documentation and/or other materials
 *       provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * The views and conclusions contained in the software and documentation are those of the
 * authors and should not be interpreted as representing official policies, either expressed
 * or implied, of BetaSteward_at_googlemail.com.
 */
package mage.abilities.effects.common.continuous;

import java.util.Locale;
import java.util.UUID;
import mage.abilities.Ability;
import mage.abilities.Mode;
import mage.abilities.effects.ContinuousEffectImpl;
import mage.cards.Card;
import mage.constants.Duration;
import mage.constants.Layer;
import mage.constants.Outcome;
import mage.constants.SubLayer;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.target.Target;

/**
 *
 * @author BetaSteward_at_googlemail.com
 */
public class GainAbilityTargetEffect extends ContinuousEffectImpl {

    protected Ability ability;
    // shall a card gain the ability (otherwise permanent)
    private boolean onCard;

    public GainAbilityTargetEffect(Ability ability, Duration duration) {
        this(ability, duration, null);
    }

    public GainAbilityTargetEffect(Ability ability, Duration duration, String rule) {
        this(ability, duration, rule, false);
    }

    public GainAbilityTargetEffect(Ability ability, Duration duration, String rule, boolean onCard) {
        this(ability, duration, rule, onCard, Layer.AbilityAddingRemovingEffects_6, SubLayer.NA);
    }

    public GainAbilityTargetEffect(Ability ability, Duration duration, String rule, boolean onCard, Layer layer, SubLayer subLayer) {
        super(duration, layer, subLayer,
                !ability.getEffects().isEmpty() ? ability.getEffects().get(0).getOutcome() : Outcome.AddAbility);
        this.ability = ability;
        staticText = rule;
        this.onCard = onCard;
    }

    public GainAbilityTargetEffect(final GainAbilityTargetEffect effect) {
        super(effect);
        this.ability = effect.ability.copy();
        ability.newId(); // This is needed if the effect is copied e.g. by a clone so the ability can be added multiple times to permanents
        this.onCard = effect.onCard;
    }

    @Override
    public GainAbilityTargetEffect copy() {
        return new GainAbilityTargetEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        int affectedTargets = 0;
        if (onCard) {
            for (UUID cardId : targetPointer.getTargets(game, source)) {
                Card card = game.getCard(cardId);
                if (card != null) {
                    game.getState().addOtherAbility(card, ability);
                    affectedTargets++;
                }
            }
            if (duration == Duration.OneUse) {
                discard();
            }
        } else {
            for (UUID permanentId : targetPointer.getTargets(game, source)) {
                Permanent permanent = game.getPermanentOrLKIBattlefield(permanentId);
                if (permanent != null) {
                    permanent.addAbility(ability, source.getSourceId(), game, false);
                    affectedTargets++;
                }
            }
        }
        if (duration == Duration.Custom && affectedTargets == 0) {
            this.discard();
        }
        return affectedTargets > 0;
    }

    @Override
    public String getText(Mode mode) {
        if (staticText != null && !staticText.isEmpty()) {
            return staticText;
        }
        StringBuilder sb = new StringBuilder();
        Target target = mode.getTargets().get(0);
        if (target.getMaxNumberOfTargets() == Integer.MAX_VALUE) {
            sb.append("any number of target ").append(target.getTargetName()).append(" gain ");
        } else if (target.getMaxNumberOfTargets() > 1) {
            if (target.getNumberOfTargets() < target.getMaxNumberOfTargets()) {
                sb.append("up to ");
            }
            sb.append(target.getMaxNumberOfTargets()).append(" target ").append(target.getTargetName()).append(" gain ");
        } else {
            if (!target.getTargetName().toUpperCase().startsWith("ANOTHER")) {
                sb.append("target ");
            }
            sb.append(target.getTargetName()).append(" gains ");

        }
        sb.append(ability.getRule());
        if (durationPhaseStep != null) {
            sb.append(" until your next ").append(durationPhaseStep.toString().toLowerCase(Locale.ENGLISH));
        } else if (!duration.toString().isEmpty()) {
            sb.append(' ').append(duration.toString());
        }
        return sb.toString();
    }

}
