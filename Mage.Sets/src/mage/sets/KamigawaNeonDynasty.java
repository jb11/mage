package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author TheElk801
 */
public final class KamigawaNeonDynasty extends ExpansionSet {

    private static final KamigawaNeonDynasty instance = new KamigawaNeonDynasty();

    public static KamigawaNeonDynasty getInstance() {
        return instance;
    }

    private KamigawaNeonDynasty() {
        super("Kamigawa: Neon Dynasty", "NEO", ExpansionSet.buildDate(2022, 2, 18), SetType.EXPANSION);
        this.blockName = "Kamigawa: Neon Dynasty";
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterDoubleFaced = 1; // temporary test fix

        cards.add(new SetCardInfo("Acquisition Octopus", 44, Rarity.UNCOMMON, mage.cards.a.AcquisitionOctopus.class));
        cards.add(new SetCardInfo("Akki Ember-Keeper", 130, Rarity.COMMON, mage.cards.a.AkkiEmberKeeper.class));
        cards.add(new SetCardInfo("Akki Ronin", 131, Rarity.COMMON, mage.cards.a.AkkiRonin.class));
        cards.add(new SetCardInfo("Akki War Paint", 132, Rarity.COMMON, mage.cards.a.AkkiWarPaint.class));
        cards.add(new SetCardInfo("Ambitious Assault", 133, Rarity.COMMON, mage.cards.a.AmbitiousAssault.class));
        cards.add(new SetCardInfo("Ancestral Katana", 1, Rarity.COMMON, mage.cards.a.AncestralKatana.class));
        cards.add(new SetCardInfo("Anchor to Reality", 45, Rarity.UNCOMMON, mage.cards.a.AnchorToReality.class));
        cards.add(new SetCardInfo("Animus of Night's Reach", 109, Rarity.UNCOMMON, mage.cards.a.AnimusOfNightsReach.class));
        cards.add(new SetCardInfo("Ao, the Dawn Sky", 2, Rarity.MYTHIC, mage.cards.a.AoTheDawnSky.class));
        cards.add(new SetCardInfo("Architect of Restoration", 34, Rarity.RARE, mage.cards.a.ArchitectOfRestoration.class));
        cards.add(new SetCardInfo("Armguard Familiar", 46, Rarity.COMMON, mage.cards.a.ArmguardFamiliar.class));
        cards.add(new SetCardInfo("Asari Captain", 215, Rarity.UNCOMMON, mage.cards.a.AsariCaptain.class));
        cards.add(new SetCardInfo("Assassin's Ink", 87, Rarity.UNCOMMON, mage.cards.a.AssassinsInk.class));
        cards.add(new SetCardInfo("Atsushi, the Blazing Sky", 134, Rarity.MYTHIC, mage.cards.a.AtsushiTheBlazingSky.class));
        cards.add(new SetCardInfo("Automated Artificer", 239, Rarity.COMMON, mage.cards.a.AutomatedArtificer.class));
        cards.add(new SetCardInfo("Awakened Awareness", 47, Rarity.UNCOMMON, mage.cards.a.AwakenedAwareness.class));
        cards.add(new SetCardInfo("Azusa's Many Journeys", 172, Rarity.UNCOMMON, mage.cards.a.AzusasManyJourneys.class));
        cards.add(new SetCardInfo("Bamboo Grove Archer", 173, Rarity.COMMON, mage.cards.b.BambooGroveArcher.class));
        cards.add(new SetCardInfo("Banishing Slash", 3, Rarity.UNCOMMON, mage.cards.b.BanishingSlash.class));
        cards.add(new SetCardInfo("Bearer of Memory", 174, Rarity.COMMON, mage.cards.b.BearerOfMemory.class));
        cards.add(new SetCardInfo("Befriending the Moths", 4, Rarity.COMMON, mage.cards.b.BefriendingTheMoths.class));
        cards.add(new SetCardInfo("Behold the Unspeakable", 48, Rarity.UNCOMMON, mage.cards.b.BeholdTheUnspeakable.class));
        cards.add(new SetCardInfo("Biting-Palm Ninja", 88, Rarity.RARE, mage.cards.b.BitingPalmNinja.class));
        cards.add(new SetCardInfo("Blade of the Oni", 89, Rarity.MYTHIC, mage.cards.b.BladeOfTheOni.class));
        cards.add(new SetCardInfo("Blade-Blizzard Kitsune", 5, Rarity.UNCOMMON, mage.cards.b.BladeBlizzardKitsune.class));
        cards.add(new SetCardInfo("Bloodfell Caves", 264, Rarity.COMMON, mage.cards.b.BloodfellCaves.class));
        cards.add(new SetCardInfo("Blossom Prancer", 175, Rarity.UNCOMMON, mage.cards.b.BlossomPrancer.class));
        cards.add(new SetCardInfo("Blossoming Sands", 265, Rarity.COMMON, mage.cards.b.BlossomingSands.class));
        cards.add(new SetCardInfo("Boon of Boseiju", 176, Rarity.UNCOMMON, mage.cards.b.BoonOfBoseiju.class));
        cards.add(new SetCardInfo("Born to Drive", 6, Rarity.UNCOMMON, mage.cards.b.BornToDrive.class));
        cards.add(new SetCardInfo("Boseiju Reaches Skyward", 177, Rarity.UNCOMMON, mage.cards.b.BoseijuReachesSkyward.class));
        cards.add(new SetCardInfo("Boseiju, Who Endures", 266, Rarity.RARE, mage.cards.b.BoseijuWhoEndures.class));
        cards.add(new SetCardInfo("Branch of Boseiju", 177, Rarity.UNCOMMON, mage.cards.b.BranchOfBoseiju.class));
        cards.add(new SetCardInfo("Brilliant Restoration", 7, Rarity.RARE, mage.cards.b.BrilliantRestoration.class));
        cards.add(new SetCardInfo("Bronze Cudgels", 240, Rarity.UNCOMMON, mage.cards.b.BronzeCudgels.class));
        cards.add(new SetCardInfo("Bronzeplate Boar", 135, Rarity.UNCOMMON, mage.cards.b.BronzeplateBoar.class));
        cards.add(new SetCardInfo("Brute Suit", 241, Rarity.COMMON, mage.cards.b.BruteSuit.class));
        cards.add(new SetCardInfo("Careful Cultivation", 178, Rarity.COMMON, mage.cards.c.CarefulCultivation.class));
        cards.add(new SetCardInfo("Chainflail Centipede", 90, Rarity.COMMON, mage.cards.c.ChainflailCentipede.class));
        cards.add(new SetCardInfo("Circuit Mender", 242, Rarity.UNCOMMON, mage.cards.c.CircuitMender.class));
        cards.add(new SetCardInfo("Clawing Torment", 91, Rarity.COMMON, mage.cards.c.ClawingTorment.class));
        cards.add(new SetCardInfo("Cloudsteel Kirin", 8, Rarity.RARE, mage.cards.c.CloudsteelKirin.class));
        cards.add(new SetCardInfo("Coiling Stalker", 179, Rarity.COMMON, mage.cards.c.CoilingStalker.class));
        cards.add(new SetCardInfo("Colossal Skyturtle", 216, Rarity.UNCOMMON, mage.cards.c.ColossalSkyturtle.class));
        cards.add(new SetCardInfo("Commune with Spirits", 180, Rarity.COMMON, mage.cards.c.CommuneWithSpirits.class));
        cards.add(new SetCardInfo("Containment Construct", 243, Rarity.UNCOMMON, mage.cards.c.ContainmentConstruct.class));
        cards.add(new SetCardInfo("Covert Technician", 49, Rarity.UNCOMMON, mage.cards.c.CovertTechnician.class));
        cards.add(new SetCardInfo("Crackling Emergence", 136, Rarity.COMMON, mage.cards.c.CracklingEmergence.class));
        cards.add(new SetCardInfo("Debt to the Kami", 92, Rarity.COMMON, mage.cards.d.DebtToTheKami.class));
        cards.add(new SetCardInfo("Discover the Impossible", 50, Rarity.UNCOMMON, mage.cards.d.DiscoverTheImpossible.class));
        cards.add(new SetCardInfo("Dismal Backwater", 267, Rarity.COMMON, mage.cards.d.DismalBackwater.class));
        cards.add(new SetCardInfo("Disruption Protocol", 51, Rarity.COMMON, mage.cards.d.DisruptionProtocol.class));
        cards.add(new SetCardInfo("Dockside Chef", 93, Rarity.UNCOMMON, mage.cards.d.DocksideChef.class));
        cards.add(new SetCardInfo("Dokuchi Shadow-Walker", 94, Rarity.COMMON, mage.cards.d.DokuchiShadowWalker.class));
        cards.add(new SetCardInfo("Dokuchi Silencer", 95, Rarity.UNCOMMON, mage.cards.d.DokuchiSilencer.class));
        cards.add(new SetCardInfo("Dragon-Kami's Egg", 181, Rarity.RARE, mage.cards.d.DragonKamisEgg.class));
        cards.add(new SetCardInfo("Dragonfly Suit", 9, Rarity.COMMON, mage.cards.d.DragonflySuit.class));
        cards.add(new SetCardInfo("Dragonspark Reactor", 137, Rarity.UNCOMMON, mage.cards.d.DragonsparkReactor.class));
        cards.add(new SetCardInfo("Dramatist's Puppet", 244, Rarity.COMMON, mage.cards.d.DramatistsPuppet.class));
        cards.add(new SetCardInfo("Eater of Virtue", 245, Rarity.RARE, mage.cards.e.EaterOfVirtue.class));
        cards.add(new SetCardInfo("Echo of Death's Wail", 124, Rarity.RARE, mage.cards.e.EchoOfDeathsWail.class));
        cards.add(new SetCardInfo("Ecologist's Terrarium", 246, Rarity.COMMON, mage.cards.e.EcologistsTerrarium.class));
        cards.add(new SetCardInfo("Eiganjo Exemplar", 10, Rarity.COMMON, mage.cards.e.EiganjoExemplar.class));
        cards.add(new SetCardInfo("Eiganjo Uprising", 217, Rarity.RARE, mage.cards.e.EiganjoUprising.class));
        cards.add(new SetCardInfo("Eiganjo, Seat of the Empire", 268, Rarity.RARE, mage.cards.e.EiganjoSeatOfTheEmpire.class));
        cards.add(new SetCardInfo("Enormous Energy Blade", 96, Rarity.UNCOMMON, mage.cards.e.EnormousEnergyBlade.class));
        cards.add(new SetCardInfo("Enthusiastic Mechanaut", 218, Rarity.UNCOMMON, mage.cards.e.EnthusiasticMechanaut.class));
        cards.add(new SetCardInfo("Era of Enlightenment", 11, Rarity.COMMON, mage.cards.e.EraOfEnlightenment.class));
        cards.add(new SetCardInfo("Essence Capture", 52, Rarity.UNCOMMON, mage.cards.e.EssenceCapture.class));
        cards.add(new SetCardInfo("Etching of Kumano", 152, Rarity.UNCOMMON, mage.cards.e.EtchingOfKumano.class));
        cards.add(new SetCardInfo("Experimental Synthesizer", 138, Rarity.COMMON, mage.cards.e.ExperimentalSynthesizer.class));
        cards.add(new SetCardInfo("Explosive Entry", 139, Rarity.COMMON, mage.cards.e.ExplosiveEntry.class));
        cards.add(new SetCardInfo("Explosive Singularity", 140, Rarity.MYTHIC, mage.cards.e.ExplosiveSingularity.class));
        cards.add(new SetCardInfo("Fable of the Mirror-Breaker", 141, Rarity.RARE, mage.cards.f.FableOfTheMirrorBreaker.class));
        cards.add(new SetCardInfo("Fade into Antiquity", 182, Rarity.COMMON, mage.cards.f.FadeIntoAntiquity.class));
        cards.add(new SetCardInfo("Fang of Shigeki", 183, Rarity.COMMON, mage.cards.f.FangOfShigeki.class));
        cards.add(new SetCardInfo("Farewell", 13, Rarity.RARE, mage.cards.f.Farewell.class));
        cards.add(new SetCardInfo("Favor of Jukai", 184, Rarity.COMMON, mage.cards.f.FavorOfJukai.class));
        cards.add(new SetCardInfo("Flame Discharge", 142, Rarity.UNCOMMON, mage.cards.f.FlameDischarge.class));
        cards.add(new SetCardInfo("Forest", 291, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Fragment of Konda", 12, Rarity.UNCOMMON, mage.cards.f.FragmentOfKonda.class));
        cards.add(new SetCardInfo("Futurist Operative", 53, Rarity.UNCOMMON, mage.cards.f.FuturistOperative.class));
        cards.add(new SetCardInfo("Futurist Sentinel", 54, Rarity.COMMON, mage.cards.f.FuturistSentinel.class));
        cards.add(new SetCardInfo("Generous Visitor", 185, Rarity.UNCOMMON, mage.cards.g.GenerousVisitor.class));
        cards.add(new SetCardInfo("Geothermal Kami", 186, Rarity.COMMON, mage.cards.g.GeothermalKami.class));
        cards.add(new SetCardInfo("Gift of Wrath", 143, Rarity.COMMON, mage.cards.g.GiftOfWrath.class));
        cards.add(new SetCardInfo("Gloomshrieker", 219, Rarity.UNCOMMON, mage.cards.g.Gloomshrieker.class));
        cards.add(new SetCardInfo("Go-Shintai of Ancient Wars", 144, Rarity.UNCOMMON, mage.cards.g.GoShintaiOfAncientWars.class));
        cards.add(new SetCardInfo("Go-Shintai of Boundless Vigor", 187, Rarity.UNCOMMON, mage.cards.g.GoShintaiOfBoundlessVigor.class));
        cards.add(new SetCardInfo("Go-Shintai of Hidden Cruelty", 97, Rarity.UNCOMMON, mage.cards.g.GoShintaiOfHiddenCruelty.class));
        cards.add(new SetCardInfo("Go-Shintai of Lost Wisdom", 55, Rarity.UNCOMMON, mage.cards.g.GoShintaiOfLostWisdom.class));
        cards.add(new SetCardInfo("Go-Shintai of Shared Purpose", 14, Rarity.UNCOMMON, mage.cards.g.GoShintaiOfSharedPurpose.class));
        cards.add(new SetCardInfo("Golden-Tail Disciple", 15, Rarity.COMMON, mage.cards.g.GoldenTailDisciple.class));
        cards.add(new SetCardInfo("Goro-Goro, Disciple of Ryusei", 145, Rarity.RARE, mage.cards.g.GoroGoroDiscipleOfRyusei.class));
        cards.add(new SetCardInfo("Grafted Growth", 188, Rarity.COMMON, mage.cards.g.GraftedGrowth.class));
        cards.add(new SetCardInfo("Gravelighter", 98, Rarity.UNCOMMON, mage.cards.g.Gravelighter.class));
        cards.add(new SetCardInfo("Greasefang, Okiba Boss", 220, Rarity.RARE, mage.cards.g.GreasefangOkibaBoss.class));
        cards.add(new SetCardInfo("Greater Tanuki", 189, Rarity.COMMON, mage.cards.g.GreaterTanuki.class));
        cards.add(new SetCardInfo("Guardians of Oboro", 56, Rarity.COMMON, mage.cards.g.GuardiansOfOboro.class));
        cards.add(new SetCardInfo("Hand of Enlightenment", 11, Rarity.COMMON, mage.cards.h.HandOfEnlightenment.class));
        cards.add(new SetCardInfo("Harmonious Emergence", 190, Rarity.COMMON, mage.cards.h.HarmoniousEmergence.class));
        cards.add(new SetCardInfo("Heiko Yamazaki, the General", 146, Rarity.UNCOMMON, mage.cards.h.HeikoYamazakiTheGeneral.class));
        cards.add(new SetCardInfo("Heir of the Ancient Fang", 191, Rarity.COMMON, mage.cards.h.HeirOfTheAncientFang.class));
        cards.add(new SetCardInfo("Hidetsugu Consumes All", 221, Rarity.MYTHIC, mage.cards.h.HidetsuguConsumesAll.class));
        cards.add(new SetCardInfo("Hidetsugu, Devouring Chaos", 99, Rarity.RARE, mage.cards.h.HidetsuguDevouringChaos.class));
        cards.add(new SetCardInfo("High-Speed Hoverbike", 247, Rarity.UNCOMMON, mage.cards.h.HighSpeedHoverbike.class));
        cards.add(new SetCardInfo("Hinata, Dawn-Crowned", 222, Rarity.RARE, mage.cards.h.HinataDawnCrowned.class));
        cards.add(new SetCardInfo("Historian's Wisdom", 192, Rarity.UNCOMMON, mage.cards.h.HistoriansWisdom.class));
        cards.add(new SetCardInfo("Hotshot Mechanic", 16, Rarity.UNCOMMON, mage.cards.h.HotshotMechanic.class));
        cards.add(new SetCardInfo("Imperial Moth", 4, Rarity.COMMON, mage.cards.i.ImperialMoth.class));
        cards.add(new SetCardInfo("Imperial Oath", 17, Rarity.COMMON, mage.cards.i.ImperialOath.class));
        cards.add(new SetCardInfo("Imperial Recovery Unit", 18, Rarity.UNCOMMON, mage.cards.i.ImperialRecoveryUnit.class));
        cards.add(new SetCardInfo("Imperial Subduer", 19, Rarity.COMMON, mage.cards.i.ImperialSubduer.class));
        cards.add(new SetCardInfo("Inkrise Infiltrator", 100, Rarity.COMMON, mage.cards.i.InkriseInfiltrator.class));
        cards.add(new SetCardInfo("Intercessor's Arrest", 20, Rarity.COMMON, mage.cards.i.IntercessorsArrest.class));
        cards.add(new SetCardInfo("Inventive Iteration", 57, Rarity.RARE, mage.cards.i.InventiveIteration.class));
        cards.add(new SetCardInfo("Invigorating Hot Spring", 223, Rarity.UNCOMMON, mage.cards.i.InvigoratingHotSpring.class));
        cards.add(new SetCardInfo("Invoke Despair", 101, Rarity.RARE, mage.cards.i.InvokeDespair.class));
        cards.add(new SetCardInfo("Invoke Justice", 21, Rarity.RARE, mage.cards.i.InvokeJustice.class));
        cards.add(new SetCardInfo("Invoke the Ancients", 193, Rarity.RARE, mage.cards.i.InvokeTheAncients.class));
        cards.add(new SetCardInfo("Invoke the Winds", 58, Rarity.RARE, mage.cards.i.InvokeTheWinds.class));
        cards.add(new SetCardInfo("Iron Apprentice", 248, Rarity.COMMON, mage.cards.i.IronApprentice.class));
        cards.add(new SetCardInfo("Ironhoof Boar", 148, Rarity.COMMON, mage.cards.i.IronhoofBoar.class));
        cards.add(new SetCardInfo("Island", 285, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Isshin, Two Heavens as One", 224, Rarity.RARE, mage.cards.i.IsshinTwoHeavensAsOne.class));
        cards.add(new SetCardInfo("Jin-Gitaxias, Progress Tyrant", 59, Rarity.MYTHIC, mage.cards.j.JinGitaxiasProgressTyrant.class));
        cards.add(new SetCardInfo("Jugan Defends the Temple", 194, Rarity.MYTHIC, mage.cards.j.JuganDefendsTheTemple.class));
        cards.add(new SetCardInfo("Jukai Naturalist", 225, Rarity.UNCOMMON, mage.cards.j.JukaiNaturalist.class));
        cards.add(new SetCardInfo("Jukai Preserver", 195, Rarity.COMMON, mage.cards.j.JukaiPreserver.class));
        cards.add(new SetCardInfo("Jukai Trainee", 196, Rarity.COMMON, mage.cards.j.JukaiTrainee.class));
        cards.add(new SetCardInfo("Jungle Hollow", 269, Rarity.COMMON, mage.cards.j.JungleHollow.class));
        cards.add(new SetCardInfo("Junji, the Midnight Sky", 102, Rarity.MYTHIC, mage.cards.j.JunjiTheMidnightSky.class));
        cards.add(new SetCardInfo("Kairi, the Swirling Sky", 60, Rarity.MYTHIC, mage.cards.k.KairiTheSwirlingSky.class));
        cards.add(new SetCardInfo("Kaito Shizuki", 226, Rarity.MYTHIC, mage.cards.k.KaitoShizuki.class));
        cards.add(new SetCardInfo("Kaito's Pursuit", 103, Rarity.COMMON, mage.cards.k.KaitosPursuit.class));
        cards.add(new SetCardInfo("Kami of Industry", 149, Rarity.COMMON, mage.cards.k.KamiOfIndustry.class));
        cards.add(new SetCardInfo("Kami of Restless Shadows", 104, Rarity.COMMON, mage.cards.k.KamiOfRestlessShadows.class));
        cards.add(new SetCardInfo("Kami of Terrible Secrets", 105, Rarity.COMMON, mage.cards.k.KamiOfTerribleSecrets.class));
        cards.add(new SetCardInfo("Kami of Transience", 197, Rarity.RARE, mage.cards.k.KamiOfTransience.class));
        cards.add(new SetCardInfo("Kami's Flare", 150, Rarity.COMMON, mage.cards.k.KamisFlare.class));
        cards.add(new SetCardInfo("Kappa Tech-Wrecker", 198, Rarity.UNCOMMON, mage.cards.k.KappaTechWrecker.class));
        cards.add(new SetCardInfo("Kindled Fury", 151, Rarity.COMMON, mage.cards.k.KindledFury.class));
        cards.add(new SetCardInfo("Kirin-Touched Orochi", 212, Rarity.RARE, mage.cards.k.KirinTouchedOrochi.class));
        cards.add(new SetCardInfo("Kitsune Ace", 22, Rarity.COMMON, mage.cards.k.KitsuneAce.class));
        cards.add(new SetCardInfo("Kodama of the West Tree", 199, Rarity.MYTHIC, mage.cards.k.KodamaOfTheWestTree.class));
        cards.add(new SetCardInfo("Kotose, the Silent Spider", 351, Rarity.RARE, mage.cards.k.KotoseTheSilentSpider.class));
        cards.add(new SetCardInfo("Kumano Faces Kakkazan", 152, Rarity.UNCOMMON, mage.cards.k.KumanoFacesKakkazan.class));
        cards.add(new SetCardInfo("Kura, the Boundless Sky", 200, Rarity.MYTHIC, mage.cards.k.KuraTheBoundlessSky.class));
        cards.add(new SetCardInfo("Kyodai, Soul of Kamigawa", 23, Rarity.RARE, mage.cards.k.KyodaiSoulOfKamigawa.class));
        cards.add(new SetCardInfo("Leech Gauntlet", 106, Rarity.UNCOMMON, mage.cards.l.LeechGauntlet.class));
        cards.add(new SetCardInfo("Lethal Exploit", 107, Rarity.COMMON, mage.cards.l.LethalExploit.class));
        cards.add(new SetCardInfo("Life of Toshiro Umezawa", 108, Rarity.UNCOMMON, mage.cards.l.LifeOfToshiroUmezawa.class));
        cards.add(new SetCardInfo("Light the Way", 24, Rarity.COMMON, mage.cards.l.LightTheWay.class));
        cards.add(new SetCardInfo("Light-Paws, Emperor's Voice", 25, Rarity.RARE, mage.cards.l.LightPawsEmperorsVoice.class));
        cards.add(new SetCardInfo("Likeness of the Seeker", 172, Rarity.UNCOMMON, mage.cards.l.LikenessOfTheSeeker.class));
        cards.add(new SetCardInfo("Lion Sash", 26, Rarity.RARE, mage.cards.l.LionSash.class));
        cards.add(new SetCardInfo("Living Breakthrough", 57, Rarity.RARE, mage.cards.l.LivingBreakthrough.class));
        cards.add(new SetCardInfo("Lizard Blades", 153, Rarity.RARE, mage.cards.l.LizardBlades.class));
        cards.add(new SetCardInfo("Lucky Offering", 27, Rarity.COMMON, mage.cards.l.LuckyOffering.class));
        cards.add(new SetCardInfo("Malicious Malfunction", 110, Rarity.UNCOMMON, mage.cards.m.MaliciousMalfunction.class));
        cards.add(new SetCardInfo("March of Burgeoning Life", 201, Rarity.RARE, mage.cards.m.MarchOfBurgeoningLife.class));
        cards.add(new SetCardInfo("March of Otherworldly Light", 28, Rarity.RARE, mage.cards.m.MarchOfOtherworldlyLight.class));
        cards.add(new SetCardInfo("March of Reckless Joy", 154, Rarity.RARE, mage.cards.m.MarchOfRecklessJoy.class));
        cards.add(new SetCardInfo("March of Swirling Mist", 61, Rarity.RARE, mage.cards.m.MarchOfSwirlingMist.class));
        cards.add(new SetCardInfo("March of Wretched Sorrow", 111, Rarity.RARE, mage.cards.m.MarchOfWretchedSorrow.class));
        cards.add(new SetCardInfo("Master's Rebuke", 202, Rarity.COMMON, mage.cards.m.MastersRebuke.class));
        cards.add(new SetCardInfo("Mech Hangar", 270, Rarity.UNCOMMON, mage.cards.m.MechHangar.class));
        cards.add(new SetCardInfo("Mechtitan Core", 249, Rarity.RARE, mage.cards.m.MechtitanCore.class));
        cards.add(new SetCardInfo("Memory of Toshiro", 108, Rarity.UNCOMMON, mage.cards.m.MemoryOfToshiro.class));
        cards.add(new SetCardInfo("Michiko's Reign of Truth", 29, Rarity.UNCOMMON, mage.cards.m.MichikosReignOfTruth.class));
        cards.add(new SetCardInfo("Mindlink Mech", 62, Rarity.RARE, mage.cards.m.MindlinkMech.class));
        cards.add(new SetCardInfo("Mirror Box", 250, Rarity.RARE, mage.cards.m.MirrorBox.class));
        cards.add(new SetCardInfo("Mirrorshell Crab", 63, Rarity.COMMON, mage.cards.m.MirrorshellCrab.class));
        cards.add(new SetCardInfo("Mnemonic Sphere", 64, Rarity.COMMON, mage.cards.m.MnemonicSphere.class));
        cards.add(new SetCardInfo("Mobilizer Mech", 65, Rarity.UNCOMMON, mage.cards.m.MobilizerMech.class));
        cards.add(new SetCardInfo("Moon-Circuit Hacker", 67, Rarity.COMMON, mage.cards.m.MoonCircuitHacker.class));
        cards.add(new SetCardInfo("Moonfolk Puzzlemaker", 68, Rarity.COMMON, mage.cards.m.MoonfolkPuzzlemaker.class));
        cards.add(new SetCardInfo("Moonsnare Prototype", 69, Rarity.COMMON, mage.cards.m.MoonsnarePrototype.class));
        cards.add(new SetCardInfo("Moonsnare Specialist", 70, Rarity.COMMON, mage.cards.m.MoonsnareSpecialist.class));
        cards.add(new SetCardInfo("Mothrider Patrol", 30, Rarity.COMMON, mage.cards.m.MothriderPatrol.class));
        cards.add(new SetCardInfo("Mountain", 289, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mukotai Ambusher", 112, Rarity.COMMON, mage.cards.m.MukotaiAmbusher.class));
        cards.add(new SetCardInfo("Mukotai Soulripper", 113, Rarity.RARE, mage.cards.m.MukotaiSoulripper.class));
        cards.add(new SetCardInfo("Nameless Conqueror", 162, Rarity.COMMON, mage.cards.n.NamelessConqueror.class));
        cards.add(new SetCardInfo("Naomi, Pillar of Order", 229, Rarity.UNCOMMON, mage.cards.n.NaomiPillarOfOrder.class));
        cards.add(new SetCardInfo("Nashi, Moon Sage's Scion", 114, Rarity.MYTHIC, mage.cards.n.NashiMoonSagesScion.class));
        cards.add(new SetCardInfo("Network Disruptor", 71, Rarity.COMMON, mage.cards.n.NetworkDisruptor.class));
        cards.add(new SetCardInfo("Network Terminal", 251, Rarity.COMMON, mage.cards.n.NetworkTerminal.class));
        cards.add(new SetCardInfo("Nezumi Bladeblesser", 115, Rarity.COMMON, mage.cards.n.NezumiBladeblesser.class));
        cards.add(new SetCardInfo("Nezumi Prowler", 116, Rarity.UNCOMMON, mage.cards.n.NezumiProwler.class));
        cards.add(new SetCardInfo("Nezumi Road Captain", 117, Rarity.COMMON, mage.cards.n.NezumiRoadCaptain.class));
        cards.add(new SetCardInfo("Ninja's Kunai", 252, Rarity.COMMON, mage.cards.n.NinjasKunai.class));
        cards.add(new SetCardInfo("Norika Yamazaki, the Poet", 31, Rarity.UNCOMMON, mage.cards.n.NorikaYamazakiThePoet.class));
        cards.add(new SetCardInfo("O-Kagachi Made Manifest", 227, Rarity.MYTHIC, mage.cards.o.OKagachiMadeManifest.class));
        cards.add(new SetCardInfo("Ogre-Head Helm", 155, Rarity.RARE, mage.cards.o.OgreHeadHelm.class));
        cards.add(new SetCardInfo("Okiba Reckoner Raid", 117, Rarity.COMMON, mage.cards.o.OkibaReckonerRaid.class));
        cards.add(new SetCardInfo("Okiba Salvage", 118, Rarity.UNCOMMON, mage.cards.o.OkibaSalvage.class));
        cards.add(new SetCardInfo("Oni-Cult Anvil", 230, Rarity.UNCOMMON, mage.cards.o.OniCultAnvil.class));
        cards.add(new SetCardInfo("Orochi Merge-Keeper", 203, Rarity.UNCOMMON, mage.cards.o.OrochiMergeKeeper.class));
        cards.add(new SetCardInfo("Otawara, Soaring City", 271, Rarity.RARE, mage.cards.o.OtawaraSoaringCity.class));
        cards.add(new SetCardInfo("Papercraft Decoy", 253, Rarity.COMMON, mage.cards.p.PapercraftDecoy.class));
        cards.add(new SetCardInfo("Patchwork Automaton", 254, Rarity.UNCOMMON, mage.cards.p.PatchworkAutomaton.class));
        cards.add(new SetCardInfo("Peerless Samurai", 156, Rarity.COMMON, mage.cards.p.PeerlessSamurai.class));
        cards.add(new SetCardInfo("Plains", 283, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Planar Incision", 72, Rarity.COMMON, mage.cards.p.PlanarIncision.class));
        cards.add(new SetCardInfo("Portrait of Michiko", 29, Rarity.UNCOMMON, mage.cards.p.PortraitOfMichiko.class));
        cards.add(new SetCardInfo("Prodigy's Prototype", 231, Rarity.UNCOMMON, mage.cards.p.ProdigysPrototype.class));
        cards.add(new SetCardInfo("Prosperous Thief", 73, Rarity.UNCOMMON, mage.cards.p.ProsperousThief.class));
        cards.add(new SetCardInfo("Rabbit Battery", 157, Rarity.UNCOMMON, mage.cards.r.RabbitBattery.class));
        cards.add(new SetCardInfo("Raiyuu, Storm's Edge", 232, Rarity.RARE, mage.cards.r.RaiyuuStormsEdge.class));
        cards.add(new SetCardInfo("Reality Heist", 75, Rarity.UNCOMMON, mage.cards.r.RealityHeist.class));
        cards.add(new SetCardInfo("Reckoner Bankbuster", 255, Rarity.RARE, mage.cards.r.ReckonerBankbuster.class));
        cards.add(new SetCardInfo("Reckoner Shakedown", 119, Rarity.COMMON, mage.cards.r.ReckonerShakedown.class));
        cards.add(new SetCardInfo("Reckoner's Bargain", 120, Rarity.COMMON, mage.cards.r.ReckonersBargain.class));
        cards.add(new SetCardInfo("Reflection of Kiki-Jiki", 141, Rarity.RARE, mage.cards.r.ReflectionOfKikiJiki.class));
        cards.add(new SetCardInfo("Regent's Authority", 32, Rarity.COMMON, mage.cards.r.RegentsAuthority.class));
        cards.add(new SetCardInfo("Reinforced Ronin", 158, Rarity.UNCOMMON, mage.cards.r.ReinforcedRonin.class));
        cards.add(new SetCardInfo("Reito Sentinel", 256, Rarity.UNCOMMON, mage.cards.r.ReitoSentinel.class));
        cards.add(new SetCardInfo("Remnant of the Rising Star", 194, Rarity.MYTHIC, mage.cards.r.RemnantOfTheRisingStar.class));
        cards.add(new SetCardInfo("Repel the Vile", 33, Rarity.COMMON, mage.cards.r.RepelTheVile.class));
        cards.add(new SetCardInfo("Replication Specialist", 76, Rarity.UNCOMMON, mage.cards.r.ReplicationSpecialist.class));
        cards.add(new SetCardInfo("Return to Action", 121, Rarity.COMMON, mage.cards.r.ReturnToAction.class));
        cards.add(new SetCardInfo("Risona, Asari Commander", 233, Rarity.RARE, mage.cards.r.RisonaAsariCommander.class));
        cards.add(new SetCardInfo("Roadside Reliquary", 272, Rarity.UNCOMMON, mage.cards.r.RoadsideReliquary.class));
        cards.add(new SetCardInfo("Roaring Earth", 204, Rarity.UNCOMMON, mage.cards.r.RoaringEarth.class));
        cards.add(new SetCardInfo("Rugged Highlands", 273, Rarity.COMMON, mage.cards.r.RuggedHighlands.class));
        cards.add(new SetCardInfo("Runaway Trash-Bot", 257, Rarity.UNCOMMON, mage.cards.r.RunawayTrashBot.class));
        cards.add(new SetCardInfo("Saiba Trespassers", 77, Rarity.COMMON, mage.cards.s.SaibaTrespassers.class));
        cards.add(new SetCardInfo("Satoru Umezawa", 234, Rarity.RARE, mage.cards.s.SatoruUmezawa.class));
        cards.add(new SetCardInfo("Satsuki, the Living Lore", 235, Rarity.RARE, mage.cards.s.SatsukiTheLivingLore.class));
        cards.add(new SetCardInfo("Scoured Barrens", 274, Rarity.COMMON, mage.cards.s.ScouredBarrens.class));
        cards.add(new SetCardInfo("Scrap Welder", 159, Rarity.RARE, mage.cards.s.ScrapWelder.class));
        cards.add(new SetCardInfo("Scrapyard Steelbreaker", 160, Rarity.COMMON, mage.cards.s.ScrapyardSteelbreaker.class));
        cards.add(new SetCardInfo("Searchlight Companion", 258, Rarity.COMMON, mage.cards.s.SearchlightCompanion.class));
        cards.add(new SetCardInfo("Season of Renewal", 205, Rarity.COMMON, mage.cards.s.SeasonOfRenewal.class));
        cards.add(new SetCardInfo("Secluded Courtyard", 275, Rarity.UNCOMMON, mage.cards.s.SecludedCourtyard.class));
        cards.add(new SetCardInfo("Seismic Wave", 161, Rarity.UNCOMMON, mage.cards.s.SeismicWave.class));
        cards.add(new SetCardInfo("Selfless Samurai", 35, Rarity.UNCOMMON, mage.cards.s.SelflessSamurai.class));
        cards.add(new SetCardInfo("Seshiro's Living Legacy", 210, Rarity.COMMON, mage.cards.s.SeshirosLivingLegacy.class));
        cards.add(new SetCardInfo("Seven-Tail Mentor", 36, Rarity.COMMON, mage.cards.s.SevenTailMentor.class));
        cards.add(new SetCardInfo("Shigeki, Jukai Visionary", 206, Rarity.RARE, mage.cards.s.ShigekiJukaiVisionary.class));
        cards.add(new SetCardInfo("Short Circuit", 78, Rarity.COMMON, mage.cards.s.ShortCircuit.class));
        cards.add(new SetCardInfo("Shrine Steward", 259, Rarity.COMMON, mage.cards.s.ShrineSteward.class));
        cards.add(new SetCardInfo("Silver-Fur Master", 236, Rarity.UNCOMMON, mage.cards.s.SilverFurMaster.class));
        cards.add(new SetCardInfo("Simian Sling", 163, Rarity.COMMON, mage.cards.s.SimianSling.class));
        cards.add(new SetCardInfo("Sky-Blessed Samurai", 37, Rarity.UNCOMMON, mage.cards.s.SkyBlessedSamurai.class));
        cards.add(new SetCardInfo("Skyswimmer Koi", 79, Rarity.COMMON, mage.cards.s.SkyswimmerKoi.class));
        cards.add(new SetCardInfo("Sokenzan Smelter", 164, Rarity.UNCOMMON, mage.cards.s.SokenzanSmelter.class));
        cards.add(new SetCardInfo("Sokenzan, Crucible of Defiance", 276, Rarity.RARE, mage.cards.s.SokenzanCrucibleOfDefiance.class));
        cards.add(new SetCardInfo("Soul Transfer", 122, Rarity.RARE, mage.cards.s.SoulTransfer.class));
        cards.add(new SetCardInfo("Spell Pierce", 80, Rarity.COMMON, mage.cards.s.SpellPierce.class));
        cards.add(new SetCardInfo("Spinning Wheel Kick", 207, Rarity.UNCOMMON, mage.cards.s.SpinningWheelKick.class));
        cards.add(new SetCardInfo("Spirit-Sister's Call", 237, Rarity.MYTHIC, mage.cards.s.SpiritSistersCall.class));
        cards.add(new SetCardInfo("Spirited Companion", 38, Rarity.COMMON, mage.cards.s.SpiritedCompanion.class));
        cards.add(new SetCardInfo("Spring-Leaf Avenger", 208, Rarity.RARE, mage.cards.s.SpringLeafAvenger.class));
        cards.add(new SetCardInfo("Suit Up", 81, Rarity.COMMON, mage.cards.s.SuitUp.class));
        cards.add(new SetCardInfo("Sunblade Samurai", 39, Rarity.COMMON, mage.cards.s.SunbladeSamurai.class));
        cards.add(new SetCardInfo("Surgehacker Mech", 260, Rarity.RARE, mage.cards.s.SurgehackerMech.class));
        cards.add(new SetCardInfo("Swamp", 287, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swiftwater Cliffs", 277, Rarity.COMMON, mage.cards.s.SwiftwaterCliffs.class));
        cards.add(new SetCardInfo("Takenuma, Abandoned Mire", 278, Rarity.RARE, mage.cards.t.TakenumaAbandonedMire.class));
        cards.add(new SetCardInfo("Tales of Master Seshiro", 210, Rarity.COMMON, mage.cards.t.TalesOfMasterSeshiro.class));
        cards.add(new SetCardInfo("Tameshi, Reality Architect", 82, Rarity.RARE, mage.cards.t.TameshiRealityArchitect.class));
        cards.add(new SetCardInfo("Tamiyo's Compleation", 83, Rarity.COMMON, mage.cards.t.TamiyosCompleation.class));
        cards.add(new SetCardInfo("Tamiyo's Safekeeping", 211, Rarity.COMMON, mage.cards.t.TamiyosSafekeeping.class));
        cards.add(new SetCardInfo("Tamiyo, Compleated Sage", 238, Rarity.MYTHIC, mage.cards.t.TamiyoCompleatedSage.class));
        cards.add(new SetCardInfo("Tatsunari, Toad Rider", 123, Rarity.RARE, mage.cards.t.TatsunariToadRider.class));
        cards.add(new SetCardInfo("Teachings of the Kirin", 212, Rarity.RARE, mage.cards.t.TeachingsOfTheKirin.class));
        cards.add(new SetCardInfo("Tempered in Solitude", 165, Rarity.UNCOMMON, mage.cards.t.TemperedInSolitude.class));
        cards.add(new SetCardInfo("Tezzeret, Betrayer of Flesh", 84, Rarity.MYTHIC, mage.cards.t.TezzeretBetrayerOfFlesh.class));
        cards.add(new SetCardInfo("The Dragon-Kami Reborn", 181, Rarity.RARE, mage.cards.t.TheDragonKamiReborn.class));
        cards.add(new SetCardInfo("The Fall of Lord Konda", 12, Rarity.UNCOMMON, mage.cards.t.TheFallOfLordKonda.class));
        cards.add(new SetCardInfo("The Kami War", 227, Rarity.MYTHIC, mage.cards.t.TheKamiWar.class));
        cards.add(new SetCardInfo("The Long Reach of Night", 109, Rarity.UNCOMMON, mage.cards.t.TheLongReachOfNight.class));
        cards.add(new SetCardInfo("The Modern Age", 66, Rarity.COMMON, mage.cards.t.TheModernAge.class));
        cards.add(new SetCardInfo("The Reality Chip", 74, Rarity.RARE, mage.cards.t.TheRealityChip.class));
        cards.add(new SetCardInfo("The Restoration of Eiganjo", 34, Rarity.RARE, mage.cards.t.TheRestorationOfEiganjo.class));
        cards.add(new SetCardInfo("The Shattered States Era", 162, Rarity.COMMON, mage.cards.t.TheShatteredStatesEra.class));
        cards.add(new SetCardInfo("The Wandering Emperor", 42, Rarity.MYTHIC, mage.cards.t.TheWanderingEmperor.class));
        cards.add(new SetCardInfo("Thirst for Knowledge", 85, Rarity.UNCOMMON, mage.cards.t.ThirstForKnowledge.class));
        cards.add(new SetCardInfo("Thornwood Falls", 279, Rarity.COMMON, mage.cards.t.ThornwoodFalls.class));
        cards.add(new SetCardInfo("Thousand-Faced Shadow", 86, Rarity.RARE, mage.cards.t.ThousandFacedShadow.class));
        cards.add(new SetCardInfo("Thundering Raiju", 166, Rarity.RARE, mage.cards.t.ThunderingRaiju.class));
        cards.add(new SetCardInfo("Thundersteel Colossus", 261, Rarity.COMMON, mage.cards.t.ThundersteelColossus.class));
        cards.add(new SetCardInfo("Touch the Spirit Realm", 40, Rarity.UNCOMMON, mage.cards.t.TouchTheSpiritRealm.class));
        cards.add(new SetCardInfo("Towashi Guide-Bot", 262, Rarity.UNCOMMON, mage.cards.t.TowashiGuideBot.class));
        cards.add(new SetCardInfo("Towashi Songshaper", 167, Rarity.COMMON, mage.cards.t.TowashiSongshaper.class));
        cards.add(new SetCardInfo("Tranquil Cove", 280, Rarity.COMMON, mage.cards.t.TranquilCove.class));
        cards.add(new SetCardInfo("Tribute to Horobi", 124, Rarity.RARE, mage.cards.t.TributeToHorobi.class));
        cards.add(new SetCardInfo("Twinshot Sniper", 168, Rarity.UNCOMMON, mage.cards.t.TwinshotSniper.class));
        cards.add(new SetCardInfo("Twisted Embrace", 125, Rarity.COMMON, mage.cards.t.TwistedEmbrace.class));
        cards.add(new SetCardInfo("Uncharted Haven", 281, Rarity.COMMON, mage.cards.u.UnchartedHaven.class));
        cards.add(new SetCardInfo("Undercity Scrounger", 126, Rarity.COMMON, mage.cards.u.UndercityScrounger.class));
        cards.add(new SetCardInfo("Unforgiving One", 127, Rarity.UNCOMMON, mage.cards.u.UnforgivingOne.class));
        cards.add(new SetCardInfo("Unstoppable Ogre", 169, Rarity.COMMON, mage.cards.u.UnstoppableOgre.class));
        cards.add(new SetCardInfo("Upriser Renegade", 170, Rarity.UNCOMMON, mage.cards.u.UpriserRenegade.class));
        cards.add(new SetCardInfo("Vector Glider", 66, Rarity.COMMON, mage.cards.v.VectorGlider.class));
        cards.add(new SetCardInfo("Vessel of the All-Consuming", 221, Rarity.MYTHIC, mage.cards.v.VesselOfTheAllConsuming.class));
        cards.add(new SetCardInfo("Virus Beetle", 128, Rarity.COMMON, mage.cards.v.VirusBeetle.class));
        cards.add(new SetCardInfo("Vision of the Unspeakable", 48, Rarity.UNCOMMON, mage.cards.v.VisionOfTheUnspeakable.class));
        cards.add(new SetCardInfo("Voltage Surge", 171, Rarity.COMMON, mage.cards.v.VoltageSurge.class));
        cards.add(new SetCardInfo("Walking Skyscraper", 263, Rarity.UNCOMMON, mage.cards.w.WalkingSkyscraper.class));
        cards.add(new SetCardInfo("Wanderer's Intervention", 41, Rarity.COMMON, mage.cards.w.WanderersIntervention.class));
        cards.add(new SetCardInfo("Weaver of Harmony", 213, Rarity.RARE, mage.cards.w.WeaverOfHarmony.class));
        cards.add(new SetCardInfo("Webspinner Cuff", 214, Rarity.UNCOMMON, mage.cards.w.WebspinnerCuff.class));
        cards.add(new SetCardInfo("When We Were Young", 43, Rarity.UNCOMMON, mage.cards.w.WhenWeWereYoung.class));
        cards.add(new SetCardInfo("Wind-Scarred Crag", 282, Rarity.COMMON, mage.cards.w.WindScarredCrag.class));
        cards.add(new SetCardInfo("You Are Already Dead", 129, Rarity.COMMON, mage.cards.y.YouAreAlreadyDead.class));
    }
}
