package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author TheElk801
 */
public final class JumpstartHistoricHorizons extends ExpansionSet {

    private static final JumpstartHistoricHorizons instance = new JumpstartHistoricHorizons();

    public static JumpstartHistoricHorizons getInstance() {
        return instance;
    }

    private JumpstartHistoricHorizons() {
        super("Jumpstart: Historic Horizons", "J21", ExpansionSet.buildDate(2021, 8, 12), SetType.MAGIC_ARENA);
        this.hasBoosters = false;
        this.hasBasicLands = false;

        cards.add(new SetCardInfo("Abiding Grace", 32, Rarity.UNCOMMON, mage.cards.a.AbidingGrace.class));
        cards.add(new SetCardInfo("Abzan Battle Priest", 33, Rarity.UNCOMMON, mage.cards.a.AbzanBattlePriest.class));
        cards.add(new SetCardInfo("Abzan Falconer", 34, Rarity.UNCOMMON, mage.cards.a.AbzanFalconer.class));
        cards.add(new SetCardInfo("Accursed Horde", 282, Rarity.UNCOMMON, mage.cards.a.AccursedHorde.class));
        cards.add(new SetCardInfo("Adaptive Snapjaw", 537, Rarity.COMMON, mage.cards.a.AdaptiveSnapjaw.class));
        cards.add(new SetCardInfo("Aeromoeba", 163, Rarity.COMMON, mage.cards.a.Aeromoeba.class));
        cards.add(new SetCardInfo("Aetherstream Leopard", 538, Rarity.COMMON, mage.cards.a.AetherstreamLeopard.class));
        cards.add(new SetCardInfo("Aeve, Progenitor Ooze", 539, Rarity.RARE, mage.cards.a.AeveProgenitorOoze.class));
        cards.add(new SetCardInfo("Ainok Bond-Kin", 36, Rarity.COMMON, mage.cards.a.AinokBondKin.class));
        cards.add(new SetCardInfo("Alchemist's Greeting", 407, Rarity.COMMON, mage.cards.a.AlchemistsGreeting.class));
        cards.add(new SetCardInfo("Altar of the Goyf", 733, Rarity.UNCOMMON, mage.cards.a.AltarOfTheGoyf.class));
        cards.add(new SetCardInfo("Amorphous Axe", 734, Rarity.COMMON, mage.cards.a.AmorphousAxe.class));
        cards.add(new SetCardInfo("Angel of the God-Pharaoh", 44, Rarity.UNCOMMON, mage.cards.a.AngelOfTheGodPharaoh.class));
        cards.add(new SetCardInfo("Angelic Purge", 42, Rarity.COMMON, mage.cards.a.AngelicPurge.class));
        cards.add(new SetCardInfo("Anointer of Valor", 46, Rarity.COMMON, mage.cards.a.AnointerOfValor.class));
        cards.add(new SetCardInfo("Arcbound Mouser", 47, Rarity.COMMON, mage.cards.a.ArcboundMouser.class));
        cards.add(new SetCardInfo("Arcbound Prototype", 48, Rarity.COMMON, mage.cards.a.ArcboundPrototype.class));
        cards.add(new SetCardInfo("Arcbound Shikari", 677, Rarity.UNCOMMON, mage.cards.a.ArcboundShikari.class));
        cards.add(new SetCardInfo("Arcbound Slasher", 408, Rarity.COMMON, mage.cards.a.ArcboundSlasher.class));
        cards.add(new SetCardInfo("Arcbound Tracker", 409, Rarity.COMMON, mage.cards.a.ArcboundTracker.class));
        cards.add(new SetCardInfo("Arcbound Whelp", 410, Rarity.UNCOMMON, mage.cards.a.ArcboundWhelp.class));
        cards.add(new SetCardInfo("Archfiend of Sorrows", 285, Rarity.UNCOMMON, mage.cards.a.ArchfiendOfSorrows.class));
        cards.add(new SetCardInfo("Archmage's Charm", 166, Rarity.RARE, mage.cards.a.ArchmagesCharm.class));
        cards.add(new SetCardInfo("Arcus Acolyte", 678, Rarity.UNCOMMON, mage.cards.a.ArcusAcolyte.class));
        cards.add(new SetCardInfo("Asylum Visitor", 286, Rarity.RARE, mage.cards.a.AsylumVisitor.class));
        cards.add(new SetCardInfo("Awaken the Bear", 542, Rarity.COMMON, mage.cards.a.AwakenTheBear.class));
        cards.add(new SetCardInfo("Ayula, Queen Among Bears", 543, Rarity.RARE, mage.cards.a.AyulaQueenAmongBears.class));
        cards.add(new SetCardInfo("Azra Smokeshaper", 287, Rarity.COMMON, mage.cards.a.AzraSmokeshaper.class));
        cards.add(new SetCardInfo("Bannerhide Krushok", 544, Rarity.COMMON, mage.cards.b.BannerhideKrushok.class));
        cards.add(new SetCardInfo("Barbed Spike", 50, Rarity.UNCOMMON, mage.cards.b.BarbedSpike.class));
        cards.add(new SetCardInfo("Batterbone", 735, Rarity.UNCOMMON, mage.cards.b.Batterbone.class));
        cards.add(new SetCardInfo("Battering Krasis", 545, Rarity.COMMON, mage.cards.b.BatteringKrasis.class));
        cards.add(new SetCardInfo("Battle Screech", 53, Rarity.UNCOMMON, mage.cards.b.BattleScreech.class));
        cards.add(new SetCardInfo("Battle Squadron", 413, Rarity.UNCOMMON, mage.cards.b.BattleSquadron.class));
        cards.add(new SetCardInfo("Bazaar Trademage", 169, Rarity.RARE, mage.cards.b.BazaarTrademage.class));
        cards.add(new SetCardInfo("Bear Cub", 546, Rarity.COMMON, mage.cards.b.BearCub.class));
        cards.add(new SetCardInfo("Belligerent Sliver", 415, Rarity.UNCOMMON, mage.cards.b.BelligerentSliver.class));
        cards.add(new SetCardInfo("Bestial Menace", 547, Rarity.UNCOMMON, mage.cards.b.BestialMenace.class));
        cards.add(new SetCardInfo("Birthing Boughs", 736, Rarity.UNCOMMON, mage.cards.b.BirthingBoughs.class));
        cards.add(new SetCardInfo("Blade Splicer", 54, Rarity.RARE, mage.cards.b.BladeSplicer.class));
        cards.add(new SetCardInfo("Bladeback Sliver", 417, Rarity.COMMON, mage.cards.b.BladebackSliver.class));
        cards.add(new SetCardInfo("Blazing Rootwalla", 418, Rarity.UNCOMMON, mage.cards.b.BlazingRootwalla.class));
        cards.add(new SetCardInfo("Blisterstick Shaman", 419, Rarity.COMMON, mage.cards.b.BlisterstickShaman.class));
        cards.add(new SetCardInfo("Bloodbraid Marauder", 420, Rarity.RARE, mage.cards.b.BloodbraidMarauder.class));
        cards.add(new SetCardInfo("Blur Sliver", 422, Rarity.COMMON, mage.cards.b.BlurSliver.class));
        cards.add(new SetCardInfo("Bogardan Dragonheart", 423, Rarity.COMMON, mage.cards.b.BogardanDragonheart.class));
        cards.add(new SetCardInfo("Bonded Construct", 738, Rarity.COMMON, mage.cards.b.BondedConstruct.class));
        cards.add(new SetCardInfo("Bonds of Faith", 55, Rarity.COMMON, mage.cards.b.BondsOfFaith.class));
        cards.add(new SetCardInfo("Bone Shards", 298, Rarity.COMMON, mage.cards.b.BoneShards.class));
        cards.add(new SetCardInfo("Bonescythe Sliver", 56, Rarity.RARE, mage.cards.b.BonescytheSliver.class));
        cards.add(new SetCardInfo("Boneyard Aberration", 14, Rarity.UNCOMMON, mage.cards.b.BoneyardAberration.class));
        cards.add(new SetCardInfo("Boros Elite", 57, Rarity.UNCOMMON, mage.cards.b.BorosElite.class));
        cards.add(new SetCardInfo("Bounty of the Deep", 8, Rarity.COMMON, mage.cards.b.BountyOfTheDeep.class));
        cards.add(new SetCardInfo("Breaching Hippocamp", 170, Rarity.COMMON, mage.cards.b.BreachingHippocamp.class));
        cards.add(new SetCardInfo("Breathless Knight", 680, Rarity.COMMON, mage.cards.b.BreathlessKnight.class));
        cards.add(new SetCardInfo("Bred for the Hunt", 681, Rarity.UNCOMMON, mage.cards.b.BredForTheHunt.class));
        cards.add(new SetCardInfo("Breya's Apprentice", 424, Rarity.RARE, mage.cards.b.BreyasApprentice.class));
        cards.add(new SetCardInfo("Burdened Aerialist", 173, Rarity.COMMON, mage.cards.b.BurdenedAerialist.class));
        cards.add(new SetCardInfo("Cabal Initiate", 300, Rarity.COMMON, mage.cards.c.CabalInitiate.class));
        cards.add(new SetCardInfo("Captain Ripley Vance", 427, Rarity.UNCOMMON, mage.cards.c.CaptainRipleyVance.class));
        cards.add(new SetCardInfo("Captured by Lagacs", 682, Rarity.COMMON, mage.cards.c.CapturedByLagacs.class));
        cards.add(new SetCardInfo("Carrier Thrall", 302, Rarity.UNCOMMON, mage.cards.c.CarrierThrall.class));
        cards.add(new SetCardInfo("Chainer, Nightmare Adept", 683, Rarity.RARE, mage.cards.c.ChainerNightmareAdept.class));
        cards.add(new SetCardInfo("Changeling Outcast", 304, Rarity.COMMON, mage.cards.c.ChangelingOutcast.class));
        cards.add(new SetCardInfo("Chatter of the Squirrel", 553, Rarity.COMMON, mage.cards.c.ChatterOfTheSquirrel.class));
        cards.add(new SetCardInfo("Chatterfang, Squirrel General", 552, Rarity.MYTHIC, mage.cards.c.ChatterfangSquirrelGeneral.class));
        cards.add(new SetCardInfo("Chatterstorm", 554, Rarity.COMMON, mage.cards.c.Chatterstorm.class));
        cards.add(new SetCardInfo("Chitterspitter", 555, Rarity.RARE, mage.cards.c.Chitterspitter.class));
        cards.add(new SetCardInfo("Choking Tethers", 178, Rarity.COMMON, mage.cards.c.ChokingTethers.class));
        cards.add(new SetCardInfo("Chrome Courier", 684, Rarity.COMMON, mage.cards.c.ChromeCourier.class));
        cards.add(new SetCardInfo("Clattering Augur", 305, Rarity.UNCOMMON, mage.cards.c.ClatteringAugur.class));
        cards.add(new SetCardInfo("Cleaving Sliver", 430, Rarity.COMMON, mage.cards.c.CleavingSliver.class));
        cards.add(new SetCardInfo("Cloudshredder Sliver", 685, Rarity.RARE, mage.cards.c.CloudshredderSliver.class));
        cards.add(new SetCardInfo("Combine Chrysalis", 686, Rarity.UNCOMMON, mage.cards.c.CombineChrysalis.class));
        cards.add(new SetCardInfo("Coralhelm Guide", 179, Rarity.COMMON, mage.cards.c.CoralhelmGuide.class));
        cards.add(new SetCardInfo("Cordial Vampire", 306, Rarity.RARE, mage.cards.c.CordialVampire.class));
        cards.add(new SetCardInfo("Crocanura", 557, Rarity.COMMON, mage.cards.c.Crocanura.class));
        cards.add(new SetCardInfo("Dark Salvation", 308, Rarity.RARE, mage.cards.d.DarkSalvation.class));
        cards.add(new SetCardInfo("Death Wind", 314, Rarity.COMMON, mage.cards.d.DeathWind.class));
        cards.add(new SetCardInfo("Deepwood Denizen", 558, Rarity.COMMON, mage.cards.d.DeepwoodDenizen.class));
        cards.add(new SetCardInfo("Devouring Light", 67, Rarity.UNCOMMON, mage.cards.d.DevouringLight.class));
        cards.add(new SetCardInfo("Diffusion Sliver", 181, Rarity.UNCOMMON, mage.cards.d.DiffusionSliver.class));
        cards.add(new SetCardInfo("Diregraf Colossus", 316, Rarity.RARE, mage.cards.d.DiregrafColossus.class));
        cards.add(new SetCardInfo("Discerning Taste", 317, Rarity.COMMON, mage.cards.d.DiscerningTaste.class));
        cards.add(new SetCardInfo("Disciple of the Sun", 68, Rarity.COMMON, mage.cards.d.DiscipleOfTheSun.class));
        cards.add(new SetCardInfo("Dismiss", 182, Rarity.UNCOMMON, mage.cards.d.Dismiss.class));
        cards.add(new SetCardInfo("Djeru's Renunciation", 69, Rarity.COMMON, mage.cards.d.DjerusRenunciation.class));
        cards.add(new SetCardInfo("Doomed Traveler", 70, Rarity.COMMON, mage.cards.d.DoomedTraveler.class));
        cards.add(new SetCardInfo("Dragon Mantle", 437, Rarity.COMMON, mage.cards.d.DragonMantle.class));
        cards.add(new SetCardInfo("Dragon's Rage Channeler", 438, Rarity.UNCOMMON, mage.cards.d.DragonsRageChanneler.class));
        cards.add(new SetCardInfo("Dregscape Sliver", 319, Rarity.UNCOMMON, mage.cards.d.DregscapeSliver.class));
        cards.add(new SetCardInfo("Drey Keeper", 687, Rarity.COMMON, mage.cards.d.DreyKeeper.class));
        cards.add(new SetCardInfo("Duskshell Crawler", 561, Rarity.COMMON, mage.cards.d.DuskshellCrawler.class));
        cards.add(new SetCardInfo("Echoing Return", 320, Rarity.COMMON, mage.cards.e.EchoingReturn.class));
        cards.add(new SetCardInfo("Elusive Krasis", 688, Rarity.UNCOMMON, mage.cards.e.ElusiveKrasis.class));
        cards.add(new SetCardInfo("Endling", 322, Rarity.RARE, mage.cards.e.Endling.class));
        cards.add(new SetCardInfo("Enduring Sliver", 74, Rarity.COMMON, mage.cards.e.EnduringSliver.class));
        cards.add(new SetCardInfo("Esper Sentinel", 75, Rarity.RARE, mage.cards.e.EsperSentinel.class));
        cards.add(new SetCardInfo("Etchings of the Chosen", 689, Rarity.UNCOMMON, mage.cards.e.EtchingsOfTheChosen.class));
        cards.add(new SetCardInfo("Etherium Spinner", 184, Rarity.COMMON, mage.cards.e.EtheriumSpinner.class));
        cards.add(new SetCardInfo("Excavating Anurid", 568, Rarity.COMMON, mage.cards.e.ExcavatingAnurid.class));
        cards.add(new SetCardInfo("Eyeblight Assassin", 325, Rarity.COMMON, mage.cards.e.EyeblightAssassin.class));
        cards.add(new SetCardInfo("Eyekite", 188, Rarity.COMMON, mage.cards.e.Eyekite.class));
        cards.add(new SetCardInfo("Faceless Agent", 1, Rarity.COMMON, mage.cards.f.FacelessAgent.class));
        cards.add(new SetCardInfo("Facevaulter", 326, Rarity.COMMON, mage.cards.f.Facevaulter.class));
        cards.add(new SetCardInfo("Faerie Seer", 190, Rarity.COMMON, mage.cards.f.FaerieSeer.class));
        cards.add(new SetCardInfo("Fairgrounds Patrol", 77, Rarity.COMMON, mage.cards.f.FairgroundsPatrol.class));
        cards.add(new SetCardInfo("Faithless Salvaging", 439, Rarity.COMMON, mage.cards.f.FaithlessSalvaging.class));
        cards.add(new SetCardInfo("Fast // Furious", 730, Rarity.UNCOMMON, mage.cards.f.FastFurious.class));
        cards.add(new SetCardInfo("Fiery Temper", 440, Rarity.COMMON, mage.cards.f.FieryTemper.class));
        cards.add(new SetCardInfo("Filigree Attendant", 192, Rarity.UNCOMMON, mage.cards.f.FiligreeAttendant.class));
        cards.add(new SetCardInfo("First Sliver's Chosen", 81, Rarity.UNCOMMON, mage.cards.f.FirstSliversChosen.class));
        cards.add(new SetCardInfo("First-Sphere Gargantua", 330, Rarity.COMMON, mage.cards.f.FirstSphereGargantua.class));
        cards.add(new SetCardInfo("Fists of Flame", 443, Rarity.COMMON, mage.cards.f.FistsOfFlame.class));
        cards.add(new SetCardInfo("Fleshbag Marauder", 331, Rarity.UNCOMMON, mage.cards.f.FleshbagMarauder.class));
        cards.add(new SetCardInfo("Floodhound", 193, Rarity.COMMON, mage.cards.f.Floodhound.class));
        cards.add(new SetCardInfo("Foul Watcher", 194, Rarity.COMMON, mage.cards.f.FoulWatcher.class));
        cards.add(new SetCardInfo("Foundry Street Denizen", 446, Rarity.COMMON, mage.cards.f.FoundryStreetDenizen.class));
        cards.add(new SetCardInfo("Funnel-Web Recluse", 573, Rarity.COMMON, mage.cards.f.FunnelWebRecluse.class));
        cards.add(new SetCardInfo("Furyblade Vampire", 448, Rarity.UNCOMMON, mage.cards.f.FurybladeVampire.class));
        cards.add(new SetCardInfo("Galvanic Relay", 450, Rarity.COMMON, mage.cards.g.GalvanicRelay.class));
        cards.add(new SetCardInfo("Geomancer's Gambit", 452, Rarity.COMMON, mage.cards.g.GeomancersGambit.class));
        cards.add(new SetCardInfo("Ghost-Lit Drifter", 196, Rarity.UNCOMMON, mage.cards.g.GhostLitDrifter.class));
        cards.add(new SetCardInfo("Gilded Light", 86, Rarity.COMMON, mage.cards.g.GildedLight.class));
        cards.add(new SetCardInfo("Gilt-Blade Prowler", 332, Rarity.COMMON, mage.cards.g.GiltBladeProwler.class));
        cards.add(new SetCardInfo("Glimmer Bairn", 576, Rarity.COMMON, mage.cards.g.GlimmerBairn.class));
        cards.add(new SetCardInfo("Glorious Enforcer", 89, Rarity.UNCOMMON, mage.cards.g.GloriousEnforcer.class));
        cards.add(new SetCardInfo("Goatnap", 453, Rarity.COMMON, mage.cards.g.Goatnap.class));
        cards.add(new SetCardInfo("Goblin Anarchomancer", 693, Rarity.COMMON, mage.cards.g.GoblinAnarchomancer.class));
        cards.add(new SetCardInfo("Goblin Dark-Dwellers", 457, Rarity.RARE, mage.cards.g.GoblinDarkDwellers.class));
        cards.add(new SetCardInfo("Goblin Engineer", 458, Rarity.RARE, mage.cards.g.GoblinEngineer.class));
        cards.add(new SetCardInfo("Good-Fortune Unicorn", 694, Rarity.UNCOMMON, mage.cards.g.GoodFortuneUnicorn.class));
        cards.add(new SetCardInfo("Gouged Zealot", 463, Rarity.COMMON, mage.cards.g.GougedZealot.class));
        cards.add(new SetCardInfo("Graceful Restoration", 695, Rarity.UNCOMMON, mage.cards.g.GracefulRestoration.class));
        cards.add(new SetCardInfo("Graveshifter", 334, Rarity.UNCOMMON, mage.cards.g.Graveshifter.class));
        cards.add(new SetCardInfo("Grizzly Bears", 580, Rarity.COMMON, mage.cards.g.GrizzlyBears.class));
        cards.add(new SetCardInfo("Hanweir Militia Captain", 90, Rarity.RARE, mage.cards.h.HanweirMilitiaCaptain.class));
        cards.add(new SetCardInfo("Hard Evidence", 200, Rarity.COMMON, mage.cards.h.HardEvidence.class));
        cards.add(new SetCardInfo("Hardened Scales", 582, Rarity.RARE, mage.cards.h.HardenedScales.class));
        cards.add(new SetCardInfo("Harmonic Prodigy", 466, Rarity.RARE, mage.cards.h.HarmonicProdigy.class));
        cards.add(new SetCardInfo("Harrow", 583, Rarity.COMMON, mage.cards.h.Harrow.class));
        cards.add(new SetCardInfo("Haunted Dead", 336, Rarity.UNCOMMON, mage.cards.h.HauntedDead.class));
        cards.add(new SetCardInfo("Healer's Flock", 91, Rarity.UNCOMMON, mage.cards.h.HealersFlock.class));
        cards.add(new SetCardInfo("Heir of Falkenrath", 338, Rarity.UNCOMMON, mage.cards.h.HeirOfFalkenrath.class));
        cards.add(new SetCardInfo("Heir to the Night", 338, Rarity.UNCOMMON, mage.cards.h.HeirToTheNight.class));
        cards.add(new SetCardInfo("Hell Mongrel", 339, Rarity.COMMON, mage.cards.h.HellMongrel.class));
        cards.add(new SetCardInfo("Herd Baloth", 584, Rarity.UNCOMMON, mage.cards.h.HerdBaloth.class));
        cards.add(new SetCardInfo("Hive Stirrings", 94, Rarity.COMMON, mage.cards.h.HiveStirrings.class));
        cards.add(new SetCardInfo("Hollowhead Sliver", 469, Rarity.UNCOMMON, mage.cards.h.HollowheadSliver.class));
        cards.add(new SetCardInfo("Hordeling Outburst", 470, Rarity.UNCOMMON, mage.cards.h.HordelingOutburst.class));
        cards.add(new SetCardInfo("Hunting Pack", 587, Rarity.UNCOMMON, mage.cards.h.HuntingPack.class));
        cards.add(new SetCardInfo("Igneous Elemental", 471, Rarity.COMMON, mage.cards.i.IgneousElemental.class));
        cards.add(new SetCardInfo("Implement of Combustion", 744, Rarity.COMMON, mage.cards.i.ImplementOfCombustion.class));
        cards.add(new SetCardInfo("Impostor of the Sixth Pride", 96, Rarity.COMMON, mage.cards.i.ImpostorOfTheSixthPride.class));
        cards.add(new SetCardInfo("Incorrigible Youths", 473, Rarity.UNCOMMON, mage.cards.i.IncorrigibleYouths.class));
        cards.add(new SetCardInfo("Incremental Growth", 588, Rarity.UNCOMMON, mage.cards.i.IncrementalGrowth.class));
        cards.add(new SetCardInfo("Indulgent Aristocrat", 340, Rarity.UNCOMMON, mage.cards.i.IndulgentAristocrat.class));
        cards.add(new SetCardInfo("Ingenious Infiltrator", 697, Rarity.UNCOMMON, mage.cards.i.IngeniousInfiltrator.class));
        cards.add(new SetCardInfo("Insatiable Gorgers", 474, Rarity.UNCOMMON, mage.cards.i.InsatiableGorgers.class));
        cards.add(new SetCardInfo("Insolent Neonate", 475, Rarity.COMMON, mage.cards.i.InsolentNeonate.class));
        cards.add(new SetCardInfo("Irregular Cohort", 97, Rarity.COMMON, mage.cards.i.IrregularCohort.class));
        cards.add(new SetCardInfo("Jewel-Eyed Cobra", 592, Rarity.COMMON, mage.cards.j.JewelEyedCobra.class));
        cards.add(new SetCardInfo("Junk Winder", 204, Rarity.UNCOMMON, mage.cards.j.JunkWinder.class));
        cards.add(new SetCardInfo("Just the Wind", 205, Rarity.COMMON, mage.cards.j.JustTheWind.class));
        cards.add(new SetCardInfo("Khalni Garden", 770, Rarity.COMMON, mage.cards.k.KhalniGarden.class));
        cards.add(new SetCardInfo("King of the Pride", 99, Rarity.UNCOMMON, mage.cards.k.KingOfThePride.class));
        cards.add(new SetCardInfo("Kitchen Imp", 342, Rarity.COMMON, mage.cards.k.KitchenImp.class));
        cards.add(new SetCardInfo("Kor Skyfisher", 100, Rarity.COMMON, mage.cards.k.KorSkyfisher.class));
        cards.add(new SetCardInfo("Krenko's Command", 480, Rarity.COMMON, mage.cards.k.KrenkosCommand.class));
        cards.add(new SetCardInfo("Kuldotha Flamefiend", 481, Rarity.UNCOMMON, mage.cards.k.KuldothaFlamefiend.class));
        cards.add(new SetCardInfo("Lancer Sliver", 102, Rarity.COMMON, mage.cards.l.LancerSliver.class));
        cards.add(new SetCardInfo("Late to Dinner", 103, Rarity.COMMON, mage.cards.l.LateToDinner.class));
        cards.add(new SetCardInfo("Lavabelly Sliver", 701, Rarity.UNCOMMON, mage.cards.l.LavabellySliver.class));
        cards.add(new SetCardInfo("Lazotep Chancellor", 702, Rarity.UNCOMMON, mage.cards.l.LazotepChancellor.class));
        cards.add(new SetCardInfo("Leeching Sliver", 344, Rarity.UNCOMMON, mage.cards.l.LeechingSliver.class));
        cards.add(new SetCardInfo("Legion Vanguard", 345, Rarity.UNCOMMON, mage.cards.l.LegionVanguard.class));
        cards.add(new SetCardInfo("Lightning Spear", 484, Rarity.COMMON, mage.cards.l.LightningSpear.class));
        cards.add(new SetCardInfo("Llanowar Tribe", 598, Rarity.UNCOMMON, mage.cards.l.LlanowarTribe.class));
        cards.add(new SetCardInfo("Lonis, Cryptozoologist", 703, Rarity.RARE, mage.cards.l.LonisCryptozoologist.class));
        cards.add(new SetCardInfo("Mad Prophet", 487, Rarity.COMMON, mage.cards.m.MadProphet.class));
        cards.add(new SetCardInfo("Man-o'-War", 212, Rarity.COMMON, mage.cards.m.ManOWar.class));
        cards.add(new SetCardInfo("Manaweft Sliver", 601, Rarity.UNCOMMON, mage.cards.m.ManaweftSliver.class));
        cards.add(new SetCardInfo("Manic Scribe", 211, Rarity.UNCOMMON, mage.cards.m.ManicScribe.class));
        cards.add(new SetCardInfo("Manor Guardian", 17, Rarity.UNCOMMON, mage.cards.m.ManorGuardian.class));
        cards.add(new SetCardInfo("Markov Crusader", 354, Rarity.UNCOMMON, mage.cards.m.MarkovCrusader.class));
        cards.add(new SetCardInfo("Marrow-Gnawer", 355, Rarity.RARE, mage.cards.m.MarrowGnawer.class));
        cards.add(new SetCardInfo("Master of the Pearl Trident", 214, Rarity.RARE, mage.cards.m.MasterOfThePearlTrident.class));
        cards.add(new SetCardInfo("Mind Rake", 357, Rarity.COMMON, mage.cards.m.MindRake.class));
        cards.add(new SetCardInfo("Mist-Syndicate Naga", 218, Rarity.RARE, mage.cards.m.MistSyndicateNaga.class));
        cards.add(new SetCardInfo("Mob", 359, Rarity.COMMON, mage.cards.m.Mob.class));
        cards.add(new SetCardInfo("Monoskelion", 748, Rarity.UNCOMMON, mage.cards.m.Monoskelion.class));
        cards.add(new SetCardInfo("Moonblade Shinobi", 220, Rarity.COMMON, mage.cards.m.MoonbladeShinobi.class));
        cards.add(new SetCardInfo("Mother Bear", 604, Rarity.COMMON, mage.cards.m.MotherBear.class));
        cards.add(new SetCardInfo("Mulldrifter", 221, Rarity.COMMON, mage.cards.m.Mulldrifter.class));
        cards.add(new SetCardInfo("Munitions Expert", 705, Rarity.UNCOMMON, mage.cards.m.MunitionsExpert.class));
        cards.add(new SetCardInfo("Murasa Behemoth", 606, Rarity.COMMON, mage.cards.m.MurasaBehemoth.class));
        cards.add(new SetCardInfo("Myr Enforcer", 749, Rarity.COMMON, mage.cards.m.MyrEnforcer.class));
        cards.add(new SetCardInfo("Myr Scrapling", 750, Rarity.COMMON, mage.cards.m.MyrScrapling.class));
        cards.add(new SetCardInfo("Nantuko Cultivator", 607, Rarity.UNCOMMON, mage.cards.n.NantukoCultivator.class));
        cards.add(new SetCardInfo("Necrogoyf", 363, Rarity.RARE, mage.cards.n.Necrogoyf.class));
        cards.add(new SetCardInfo("Necromancer's Familiar", 364, Rarity.UNCOMMON, mage.cards.n.NecromancersFamiliar.class));
        cards.add(new SetCardInfo("Nested Shambler", 365, Rarity.COMMON, mage.cards.n.NestedShambler.class));
        cards.add(new SetCardInfo("Nether Spirit", 366, Rarity.RARE, mage.cards.n.NetherSpirit.class));
        cards.add(new SetCardInfo("Nettlecyst", 752, Rarity.RARE, mage.cards.n.Nettlecyst.class));
        cards.add(new SetCardInfo("Nezumi Cutthroat", 367, Rarity.COMMON, mage.cards.n.NezumiCutthroat.class));
        cards.add(new SetCardInfo("Nimbus Swimmer", 706, Rarity.UNCOMMON, mage.cards.n.NimbusSwimmer.class));
        cards.add(new SetCardInfo("Ninja of the Deep Hours", 223, Rarity.COMMON, mage.cards.n.NinjaOfTheDeepHours.class));
        cards.add(new SetCardInfo("Ojutai's Summons", 224, Rarity.COMMON, mage.cards.o.OjutaisSummons.class));
        cards.add(new SetCardInfo("Okiba-Gang Shinobi", 370, Rarity.COMMON, mage.cards.o.OkibaGangShinobi.class));
        cards.add(new SetCardInfo("Ore-Scale Guardian", 493, Rarity.UNCOMMON, mage.cards.o.OreScaleGuardian.class));
        cards.add(new SetCardInfo("Ornithopter of Paradise", 753, Rarity.COMMON, mage.cards.o.OrnithopterOfParadise.class));
        cards.add(new SetCardInfo("Parallel Lives", 615, Rarity.RARE, mage.cards.p.ParallelLives.class));
        cards.add(new SetCardInfo("Parcel Myr", 227, Rarity.COMMON, mage.cards.p.ParcelMyr.class));
        cards.add(new SetCardInfo("Pashalik Mons", 495, Rarity.RARE, mage.cards.p.PashalikMons.class));
        cards.add(new SetCardInfo("Phantasmal Form", 229, Rarity.COMMON, mage.cards.p.PhantasmalForm.class));
        cards.add(new SetCardInfo("Phantom Ninja", 230, Rarity.COMMON, mage.cards.p.PhantomNinja.class));
        cards.add(new SetCardInfo("Pondering Mage", 231, Rarity.COMMON, mage.cards.p.PonderingMage.class));
        cards.add(new SetCardInfo("Predatory Sliver", 619, Rarity.COMMON, mage.cards.p.PredatorySliver.class));
        cards.add(new SetCardInfo("Prey's Vengeance", 620, Rarity.COMMON, mage.cards.p.PreysVengeance.class));
        cards.add(new SetCardInfo("Priest of Fell Rites", 707, Rarity.RARE, mage.cards.p.PriestOfFellRites.class));
        cards.add(new SetCardInfo("Prophetic Titan", 708, Rarity.UNCOMMON, mage.cards.p.PropheticTitan.class));
        cards.add(new SetCardInfo("Putrid Goblin", 375, Rarity.COMMON, mage.cards.p.PutridGoblin.class));
        cards.add(new SetCardInfo("Radiant's Judgment", 114, Rarity.COMMON, mage.cards.r.RadiantsJudgment.class));
        cards.add(new SetCardInfo("Rage Forger", 496, Rarity.UNCOMMON, mage.cards.r.RageForger.class));
        cards.add(new SetCardInfo("Rakdos Headliner", 709, Rarity.UNCOMMON, mage.cards.r.RakdosHeadliner.class));
        cards.add(new SetCardInfo("Ranger-Captain of Eos", 115, Rarity.MYTHIC, mage.cards.r.RangerCaptainOfEos.class));
        cards.add(new SetCardInfo("Ransack the Lab", 378, Rarity.COMMON, mage.cards.r.RansackTheLab.class));
        cards.add(new SetCardInfo("Ravenous Bloodseeker", 498, Rarity.UNCOMMON, mage.cards.r.RavenousBloodseeker.class));
        cards.add(new SetCardInfo("Ravenous Squirrel", 728, Rarity.UNCOMMON, mage.cards.r.RavenousSquirrel.class));
        cards.add(new SetCardInfo("Raving Visionary", 234, Rarity.UNCOMMON, mage.cards.r.RavingVisionary.class));
        cards.add(new SetCardInfo("Reap the Past", 710, Rarity.RARE, mage.cards.r.ReapThePast.class));
        cards.add(new SetCardInfo("Recalibrate", 235, Rarity.COMMON, mage.cards.r.Recalibrate.class));
        cards.add(new SetCardInfo("Reckless Charge", 500, Rarity.COMMON, mage.cards.r.RecklessCharge.class));
        cards.add(new SetCardInfo("Reckless Racer", 501, Rarity.UNCOMMON, mage.cards.r.RecklessRacer.class));
        cards.add(new SetCardInfo("Reckless Wurm", 502, Rarity.UNCOMMON, mage.cards.r.RecklessWurm.class));
        cards.add(new SetCardInfo("Renegade Tactics", 503, Rarity.COMMON, mage.cards.r.RenegadeTactics.class));
        cards.add(new SetCardInfo("Reprobation", 116, Rarity.COMMON, mage.cards.r.Reprobation.class));
        cards.add(new SetCardInfo("Restoration Angel", 117, Rarity.RARE, mage.cards.r.RestorationAngel.class));
        cards.add(new SetCardInfo("Return to the Ranks", 118, Rarity.RARE, mage.cards.r.ReturnToTheRanks.class));
        cards.add(new SetCardInfo("Revolutionist", 504, Rarity.COMMON, mage.cards.r.Revolutionist.class));
        cards.add(new SetCardInfo("Rise and Shine", 238, Rarity.RARE, mage.cards.r.RiseAndShine.class));
        cards.add(new SetCardInfo("Roc Egg", 120, Rarity.UNCOMMON, mage.cards.r.RocEgg.class));
        cards.add(new SetCardInfo("Rotwidow Pack", 712, Rarity.UNCOMMON, mage.cards.r.RotwidowPack.class));
        cards.add(new SetCardInfo("Ruin Rat", 381, Rarity.COMMON, mage.cards.r.RuinRat.class));
        cards.add(new SetCardInfo("Ruination Rioter", 713, Rarity.UNCOMMON, mage.cards.r.RuinationRioter.class));
        cards.add(new SetCardInfo("Runeclaw Bear", 624, Rarity.COMMON, mage.cards.r.RuneclawBear.class));
        cards.add(new SetCardInfo("Sanctuary Raptor", 755, Rarity.UNCOMMON, mage.cards.s.SanctuaryRaptor.class));
        cards.add(new SetCardInfo("Sanctum Weaver", 627, Rarity.RARE, mage.cards.s.SanctumWeaver.class));
        cards.add(new SetCardInfo("Sandsteppe Outcast", 121, Rarity.COMMON, mage.cards.s.SandsteppeOutcast.class));
        cards.add(new SetCardInfo("Sarkhan's Scorn", 22, Rarity.COMMON, mage.cards.s.SarkhansScorn.class));
        cards.add(new SetCardInfo("Savage Swipe", 630, Rarity.COMMON, mage.cards.s.SavageSwipe.class));
        cards.add(new SetCardInfo("Scale Up", 631, Rarity.UNCOMMON, mage.cards.s.ScaleUp.class));
        cards.add(new SetCardInfo("Scour All Possibilities", 242, Rarity.COMMON, mage.cards.s.ScourAllPossibilities.class));
        cards.add(new SetCardInfo("Scour the Desert", 122, Rarity.UNCOMMON, mage.cards.s.ScourTheDesert.class));
        cards.add(new SetCardInfo("Scour the Laboratory", 243, Rarity.UNCOMMON, mage.cards.s.ScourTheLaboratory.class));
        cards.add(new SetCardInfo("Scurry Oak", 633, Rarity.UNCOMMON, mage.cards.s.ScurryOak.class));
        cards.add(new SetCardInfo("Scuttletide", 244, Rarity.UNCOMMON, mage.cards.s.Scuttletide.class));
        cards.add(new SetCardInfo("Scuttling Sliver", 245, Rarity.UNCOMMON, mage.cards.s.ScuttlingSliver.class));
        cards.add(new SetCardInfo("Seasoned Pyromancer", 509, Rarity.MYTHIC, mage.cards.s.SeasonedPyromancer.class));
        cards.add(new SetCardInfo("Segovian Angel", 125, Rarity.COMMON, mage.cards.s.SegovianAngel.class));
        cards.add(new SetCardInfo("Selfless Cathar", 126, Rarity.COMMON, mage.cards.s.SelflessCathar.class));
        cards.add(new SetCardInfo("Sentinel Sliver", 128, Rarity.COMMON, mage.cards.s.SentinelSliver.class));
        cards.add(new SetCardInfo("Seraph of Dawn", 129, Rarity.COMMON, mage.cards.s.SeraphOfDawn.class));
        cards.add(new SetCardInfo("Serra the Benevolent", 132, Rarity.MYTHIC, mage.cards.s.SerraTheBenevolent.class));
        cards.add(new SetCardInfo("Serra's Emissary", 131, Rarity.MYTHIC, mage.cards.s.SerrasEmissary.class));
        cards.add(new SetCardInfo("Servant of the Scale", 635, Rarity.COMMON, mage.cards.s.ServantOfTheScale.class));
        cards.add(new SetCardInfo("Shambleshark", 714, Rarity.COMMON, mage.cards.s.Shambleshark.class));
        cards.add(new SetCardInfo("Shelter", 133, Rarity.COMMON, mage.cards.s.Shelter.class));
        cards.add(new SetCardInfo("Shiv's Embrace", 511, Rarity.UNCOMMON, mage.cards.s.ShivsEmbrace.class));
        cards.add(new SetCardInfo("Shoreline Scout", 12, Rarity.UNCOMMON, mage.cards.s.ShorelineScout.class));
        cards.add(new SetCardInfo("Sinister Starfish", 383, Rarity.COMMON, mage.cards.s.SinisterStarfish.class));
        cards.add(new SetCardInfo("Skophos Reaver", 513, Rarity.COMMON, mage.cards.s.SkophosReaver.class));
        cards.add(new SetCardInfo("Skullsnatcher", 384, Rarity.COMMON, mage.cards.s.Skullsnatcher.class));
        cards.add(new SetCardInfo("Skyblade's Boon", 136, Rarity.UNCOMMON, mage.cards.s.SkybladesBoon.class));
        cards.add(new SetCardInfo("Skyshroud Lookout", 30, Rarity.UNCOMMON, mage.cards.s.SkyshroudLookout.class));
        cards.add(new SetCardInfo("Slag Strider", 514, Rarity.UNCOMMON, mage.cards.s.SlagStrider.class));
        cards.add(new SetCardInfo("Sling-Gang Lieutenant", 386, Rarity.UNCOMMON, mage.cards.s.SlingGangLieutenant.class));
        cards.add(new SetCardInfo("Sliver Hive", 776, Rarity.RARE, mage.cards.s.SliverHive.class));
        cards.add(new SetCardInfo("Smell Fear", 638, Rarity.COMMON, mage.cards.s.SmellFear.class));
        cards.add(new SetCardInfo("So Shiny", 252, Rarity.COMMON, mage.cards.s.SoShiny.class));
        cards.add(new SetCardInfo("Soul of Migration", 138, Rarity.COMMON, mage.cards.s.SoulOfMigration.class));
        cards.add(new SetCardInfo("Soulherder", 718, Rarity.UNCOMMON, mage.cards.s.Soulherder.class));
        cards.add(new SetCardInfo("Specimen Collector", 253, Rarity.UNCOMMON, mage.cards.s.SpecimenCollector.class));
        cards.add(new SetCardInfo("Spinehorn Minotaur", 516, Rarity.COMMON, mage.cards.s.SpinehornMinotaur.class));
        cards.add(new SetCardInfo("Spiteful Sliver", 517, Rarity.RARE, mage.cards.s.SpitefulSliver.class));
        cards.add(new SetCardInfo("Spreading Insurrection", 518, Rarity.UNCOMMON, mage.cards.s.SpreadingInsurrection.class));
        cards.add(new SetCardInfo("Springbloom Druid", 642, Rarity.COMMON, mage.cards.s.SpringbloomDruid.class));
        cards.add(new SetCardInfo("Squirrel Mob", 644, Rarity.RARE, mage.cards.s.SquirrelMob.class));
        cards.add(new SetCardInfo("Squirrel Sanctuary", 645, Rarity.UNCOMMON, mage.cards.s.SquirrelSanctuary.class));
        cards.add(new SetCardInfo("Squirrel Sovereign", 646, Rarity.UNCOMMON, mage.cards.s.SquirrelSovereign.class));
        cards.add(new SetCardInfo("Squirrel Wrangler", 647, Rarity.RARE, mage.cards.s.SquirrelWrangler.class));
        cards.add(new SetCardInfo("Steelfin Whale", 255, Rarity.COMMON, mage.cards.s.SteelfinWhale.class));
        cards.add(new SetCardInfo("Steelform Sliver", 144, Rarity.UNCOMMON, mage.cards.s.SteelformSliver.class));
        cards.add(new SetCardInfo("Sterling Grove", 720, Rarity.RARE, mage.cards.s.SterlingGrove.class));
        cards.add(new SetCardInfo("Stirring Address", 145, Rarity.COMMON, mage.cards.s.StirringAddress.class));
        cards.add(new SetCardInfo("Stitchwing Skaab", 256, Rarity.UNCOMMON, mage.cards.s.StitchwingSkaab.class));
        cards.add(new SetCardInfo("Storm God's Oracle", 721, Rarity.COMMON, mage.cards.s.StormGodsOracle.class));
        cards.add(new SetCardInfo("Strike It Rich", 521, Rarity.UNCOMMON, mage.cards.s.StrikeItRich.class));
        cards.add(new SetCardInfo("Striking Sliver", 522, Rarity.COMMON, mage.cards.s.StrikingSliver.class));
        cards.add(new SetCardInfo("Striped Bears", 648, Rarity.COMMON, mage.cards.s.StripedBears.class));
        cards.add(new SetCardInfo("Sudden Edict", 389, Rarity.UNCOMMON, mage.cards.s.SuddenEdict.class));
        cards.add(new SetCardInfo("Sustainer of the Realm", 146, Rarity.COMMON, mage.cards.s.SustainerOfTheRealm.class));
        cards.add(new SetCardInfo("Svyelun of Sea and Sky", 259, Rarity.MYTHIC, mage.cards.s.SvyelunOfSeaAndSky.class));
        cards.add(new SetCardInfo("Sylvan Anthem", 649, Rarity.RARE, mage.cards.s.SylvanAnthem.class));
        cards.add(new SetCardInfo("Sythis, Harvest's Hand", 722, Rarity.RARE, mage.cards.s.SythisHarvestsHand.class));
        cards.add(new SetCardInfo("Tajuru Pathwarden", 650, Rarity.COMMON, mage.cards.t.TajuruPathwarden.class));
        cards.add(new SetCardInfo("Tempered Sliver", 652, Rarity.UNCOMMON, mage.cards.t.TemperedSliver.class));
        cards.add(new SetCardInfo("Terminal Agony", 723, Rarity.COMMON, mage.cards.t.TerminalAgony.class));
        cards.add(new SetCardInfo("Territorial Kavu", 724, Rarity.RARE, mage.cards.t.TerritorialKavu.class));
        cards.add(new SetCardInfo("Thalia's Lieutenant", 148, Rarity.RARE, mage.cards.t.ThaliasLieutenant.class));
        cards.add(new SetCardInfo("The First Sliver", 691, Rarity.MYTHIC, mage.cards.t.TheFirstSliver.class));
        cards.add(new SetCardInfo("Thought Monitor", 261, Rarity.RARE, mage.cards.t.ThoughtMonitor.class));
        cards.add(new SetCardInfo("Thraben Standard Bearer", 150, Rarity.COMMON, mage.cards.t.ThrabenStandardBearer.class));
        cards.add(new SetCardInfo("Thraben Watcher", 151, Rarity.UNCOMMON, mage.cards.t.ThrabenWatcher.class));
        cards.add(new SetCardInfo("Throatseeker", 391, Rarity.UNCOMMON, mage.cards.t.Throatseeker.class));
        cards.add(new SetCardInfo("Throes of Chaos", 526, Rarity.UNCOMMON, mage.cards.t.ThroesOfChaos.class));
        cards.add(new SetCardInfo("Thunderbreak Regent", 527, Rarity.RARE, mage.cards.t.ThunderbreakRegent.class));
        cards.add(new SetCardInfo("Thundering Djinn", 725, Rarity.UNCOMMON, mage.cards.t.ThunderingDjinn.class));
        cards.add(new SetCardInfo("Tightening Coils", 263, Rarity.COMMON, mage.cards.t.TighteningCoils.class));
        cards.add(new SetCardInfo("Timeless Witness", 654, Rarity.UNCOMMON, mage.cards.t.TimelessWitness.class));
        cards.add(new SetCardInfo("Tireless Provisioner", 655, Rarity.UNCOMMON, mage.cards.t.TirelessProvisioner.class));
        cards.add(new SetCardInfo("Tourach's Canticle", 393, Rarity.COMMON, mage.cards.t.TourachsCanticle.class));
        cards.add(new SetCardInfo("Treasure Keeper", 758, Rarity.UNCOMMON, mage.cards.t.TreasureKeeper.class));
        cards.add(new SetCardInfo("Trumpeting Herd", 659, Rarity.COMMON, mage.cards.t.TrumpetingHerd.class));
        cards.add(new SetCardInfo("Twin-Silk Spider", 660, Rarity.COMMON, mage.cards.t.TwinSilkSpider.class));
        cards.add(new SetCardInfo("Ulvenwald Mysteries", 661, Rarity.UNCOMMON, mage.cards.u.UlvenwaldMysteries.class));
        cards.add(new SetCardInfo("Undead Augur", 396, Rarity.UNCOMMON, mage.cards.u.UndeadAugur.class));
        cards.add(new SetCardInfo("Unholy Heat", 529, Rarity.COMMON, mage.cards.u.UnholyHeat.class));
        cards.add(new SetCardInfo("Universal Automaton", 759, Rarity.COMMON, mage.cards.u.UniversalAutomaton.class));
        cards.add(new SetCardInfo("Urban Daggertooth", 662, Rarity.COMMON, mage.cards.u.UrbanDaggertooth.class));
        cards.add(new SetCardInfo("Venomous Changeling", 400, Rarity.COMMON, mage.cards.v.VenomousChangeling.class));
        cards.add(new SetCardInfo("Verdant Command", 664, Rarity.RARE, mage.cards.v.VerdantCommand.class));
        cards.add(new SetCardInfo("Vermin Gorger", 401, Rarity.COMMON, mage.cards.v.VerminGorger.class));
        cards.add(new SetCardInfo("Vesperlark", 156, Rarity.UNCOMMON, mage.cards.v.Vesperlark.class));
        cards.add(new SetCardInfo("Viashino Lashclaw", 530, Rarity.COMMON, mage.cards.v.ViashinoLashclaw.class));
        cards.add(new SetCardInfo("Wall of One Thousand Cuts", 157, Rarity.COMMON, mage.cards.w.WallOfOneThousandCuts.class));
        cards.add(new SetCardInfo("Warteye Witch", 404, Rarity.COMMON, mage.cards.w.WarteyeWitch.class));
        cards.add(new SetCardInfo("Wavesifter", 726, Rarity.COMMON, mage.cards.w.Wavesifter.class));
        cards.add(new SetCardInfo("Webweaver Changeling", 666, Rarity.UNCOMMON, mage.cards.w.WebweaverChangeling.class));
        cards.add(new SetCardInfo("Westvale Cult Leader", 90, Rarity.RARE, mage.cards.w.WestvaleCultLeader.class));
        cards.add(new SetCardInfo("Windcaller Aven", 275, Rarity.COMMON, mage.cards.w.WindcallerAven.class));
        cards.add(new SetCardInfo("Winding Way", 670, Rarity.COMMON, mage.cards.w.WindingWay.class));
        cards.add(new SetCardInfo("Winged Shepherd", 158, Rarity.COMMON, mage.cards.w.WingedShepherd.class));
        cards.add(new SetCardInfo("Wingsteed Trainer", 7, Rarity.UNCOMMON, mage.cards.w.WingsteedTrainer.class));
        cards.add(new SetCardInfo("Wonder", 279, Rarity.RARE, mage.cards.w.Wonder.class));
        cards.add(new SetCardInfo("Wren's Run Hydra", 672, Rarity.UNCOMMON, mage.cards.w.WrensRunHydra.class));
        cards.add(new SetCardInfo("Yawgmoth, Thran Physician", 405, Rarity.MYTHIC, mage.cards.y.YawgmothThranPhysician.class));
        cards.add(new SetCardInfo("Yoked Plowbeast", 160, Rarity.COMMON, mage.cards.y.YokedPlowbeast.class));
        cards.add(new SetCardInfo("Young Necromancer", 406, Rarity.UNCOMMON, mage.cards.y.YoungNecromancer.class));
        cards.add(new SetCardInfo("Zabaz, the Glimmerwasp", 762, Rarity.RARE, mage.cards.z.ZabazTheGlimmerwasp.class));
        cards.add(new SetCardInfo("Zhalfirin Decoy", 162, Rarity.UNCOMMON, mage.cards.z.ZhalfirinDecoy.class));
    }
}
