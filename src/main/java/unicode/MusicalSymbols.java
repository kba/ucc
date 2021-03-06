package unicode;
// Kugel's "Java Code & Tools Library", Copyright (c) 1999-2007, Theossos Comp Group

/**
 * Unicode Musical Symbols block with characters from u1D100 to u1D1FF.
 * @author Kugel, <i>Theossos Comp Group</i>
 * @version Unicode 4.1.0
 */
public interface MusicalSymbols
{
   // constant field names modified with "^MUSICAL SYMBOL " pattern 
   int SINGLE_BARLINE = 0x1D100;
   int DOUBLE_BARLINE = 0x1D101;
   int FINAL_BARLINE = 0x1D102;
   int REVERSE_FINAL_BARLINE = 0x1D103;
   int DASHED_BARLINE = 0x1D104;
   int SHORT_BARLINE = 0x1D105;
   int LEFT_REPEAT_SIGN = 0x1D106;
   int RIGHT_REPEAT_SIGN = 0x1D107;
   int REPEAT_DOTS = 0x1D108;
   int DAL_SEGNO = 0x1D109;
   int DA_CAPO = 0x1D10A;
   int SEGNO = 0x1D10B;
   int CODA = 0x1D10C;
   int REPEATED_FIGURE_1 = 0x1D10D;
   int REPEATED_FIGURE_2 = 0x1D10E;
   int REPEATED_FIGURE_3 = 0x1D10F;
   int FERMATA = 0x1D110;
   int FERMATA_BELOW = 0x1D111;
   int BREATH_MARK = 0x1D112;
   int CAESURA = 0x1D113;
   int BRACE = 0x1D114;
   int BRACKET = 0x1D115;
   int ONE_LINE_STAFF = 0x1D116;
   int TWO_LINE_STAFF = 0x1D117;
   int THREE_LINE_STAFF = 0x1D118;
   int FOUR_LINE_STAFF = 0x1D119;
   int FIVE_LINE_STAFF = 0x1D11A;
   int SIX_LINE_STAFF = 0x1D11B;
   int SIX_STRING_FRETBOARD = 0x1D11C;
   int FOUR_STRING_FRETBOARD = 0x1D11D;
   int G_CLEF = 0x1D11E;
   int G_CLEF_OTTAVA_ALTA = 0x1D11F;
   int G_CLEF_OTTAVA_BASSA = 0x1D120;
   int C_CLEF = 0x1D121;
   int F_CLEF = 0x1D122;
   int F_CLEF_OTTAVA_ALTA = 0x1D123;
   int F_CLEF_OTTAVA_BASSA = 0x1D124;
   int DRUM_CLEF_1 = 0x1D125;
   int DRUM_CLEF_2 = 0x1D126;
   int DOUBLE_SHARP = 0x1D12A;
   int DOUBLE_FLAT = 0x1D12B;
   int FLAT_UP = 0x1D12C;
   int FLAT_DOWN = 0x1D12D;
   int NATURAL_UP = 0x1D12E;
   int NATURAL_DOWN = 0x1D12F;
   int SHARP_UP = 0x1D130;
   int SHARP_DOWN = 0x1D131;
   int QUARTER_TONE_SHARP = 0x1D132;
   int QUARTER_TONE_FLAT = 0x1D133;
   int COMMON_TIME = 0x1D134;
   int CUT_TIME = 0x1D135;
   int OTTAVA_ALTA = 0x1D136;
   int OTTAVA_BASSA = 0x1D137;
   int QUINDICESIMA_ALTA = 0x1D138;
   int QUINDICESIMA_BASSA = 0x1D139;
   int MULTI_REST = 0x1D13A;
   int WHOLE_REST = 0x1D13B;
   int HALF_REST = 0x1D13C;
   int QUARTER_REST = 0x1D13D;
   int EIGHTH_REST = 0x1D13E;
   int SIXTEENTH_REST = 0x1D13F;
   int THIRTY_SECOND_REST = 0x1D140;
   int SIXTY_FOURTH_REST = 0x1D141;
   int ONE_HUNDRED_TWENTY_EIGHTH_REST = 0x1D142;
   int X_NOTEHEAD = 0x1D143;
   int PLUS_NOTEHEAD = 0x1D144;
   int CIRCLE_X_NOTEHEAD = 0x1D145;
   int SQUARE_NOTEHEAD_WHITE = 0x1D146;
   int SQUARE_NOTEHEAD_BLACK = 0x1D147;
   int TRIANGLE_NOTEHEAD_UP_WHITE = 0x1D148;
   int TRIANGLE_NOTEHEAD_UP_BLACK = 0x1D149;
   int TRIANGLE_NOTEHEAD_LEFT_WHITE = 0x1D14A;
   int TRIANGLE_NOTEHEAD_LEFT_BLACK = 0x1D14B;
   int TRIANGLE_NOTEHEAD_RIGHT_WHITE = 0x1D14C;
   int TRIANGLE_NOTEHEAD_RIGHT_BLACK = 0x1D14D;
   int TRIANGLE_NOTEHEAD_DOWN_WHITE = 0x1D14E;
   int TRIANGLE_NOTEHEAD_DOWN_BLACK = 0x1D14F;
   int TRIANGLE_NOTEHEAD_UP_RIGHT_WHITE = 0x1D150;
   int TRIANGLE_NOTEHEAD_UP_RIGHT_BLACK = 0x1D151;
   int MOON_NOTEHEAD_WHITE = 0x1D152;
   int MOON_NOTEHEAD_BLACK = 0x1D153;
   int TRIANGLE_ROUND_NOTEHEAD_DOWN_WHITE = 0x1D154;
   int TRIANGLE_ROUND_NOTEHEAD_DOWN_BLACK = 0x1D155;
   int PARENTHESIS_NOTEHEAD = 0x1D156;
   int VOID_NOTEHEAD = 0x1D157;
   int NOTEHEAD_BLACK = 0x1D158;
   int NULL_NOTEHEAD = 0x1D159;
   int CLUSTER_NOTEHEAD_WHITE = 0x1D15A;
   int CLUSTER_NOTEHEAD_BLACK = 0x1D15B;
   int BREVE = 0x1D15C;
   int WHOLE_NOTE = 0x1D15D;
   int HALF_NOTE = 0x1D15E;
   int QUARTER_NOTE = 0x1D15F;
   int EIGHTH_NOTE = 0x1D160;
   int SIXTEENTH_NOTE = 0x1D161;
   int THIRTY_SECOND_NOTE = 0x1D162;
   int SIXTY_FOURTH_NOTE = 0x1D163;
   int ONE_HUNDRED_TWENTY_EIGHTH_NOTE = 0x1D164;
   int COMBINING_STEM = 0x1D165;
   int COMBINING_SPRECHGESANG_STEM = 0x1D166;
   int COMBINING_TREMOLO_1 = 0x1D167;
   int COMBINING_TREMOLO_2 = 0x1D168;
   int COMBINING_TREMOLO_3 = 0x1D169;
   int FINGERED_TREMOLO_1 = 0x1D16A;
   int FINGERED_TREMOLO_2 = 0x1D16B;
   int FINGERED_TREMOLO_3 = 0x1D16C;
   int COMBINING_AUGMENTATION_DOT = 0x1D16D;
   int COMBINING_FLAG_1 = 0x1D16E;
   int COMBINING_FLAG_2 = 0x1D16F;
   int COMBINING_FLAG_3 = 0x1D170;
   int COMBINING_FLAG_4 = 0x1D171;
   int COMBINING_FLAG_5 = 0x1D172;
   int BEGIN_BEAM = 0x1D173;
   int END_BEAM = 0x1D174;
   int BEGIN_TIE = 0x1D175;
   int END_TIE = 0x1D176;
   int BEGIN_SLUR = 0x1D177;
   int END_SLUR = 0x1D178;
   int BEGIN_PHRASE = 0x1D179;
   int END_PHRASE = 0x1D17A;
   int COMBINING_ACCENT = 0x1D17B;
   int COMBINING_STACCATO = 0x1D17C;
   int COMBINING_TENUTO = 0x1D17D;
   int COMBINING_STACCATISSIMO = 0x1D17E;
   int COMBINING_MARCATO = 0x1D17F;
   int COMBINING_MARCATO_STACCATO = 0x1D180;
   int COMBINING_ACCENT_STACCATO = 0x1D181;
   int COMBINING_LOURE = 0x1D182;
   int ARPEGGIATO_UP = 0x1D183;
   int ARPEGGIATO_DOWN = 0x1D184;
   int COMBINING_DOIT = 0x1D185;
   int COMBINING_RIP = 0x1D186;
   int COMBINING_FLIP = 0x1D187;
   int COMBINING_SMEAR = 0x1D188;
   int COMBINING_BEND = 0x1D189;
   int COMBINING_DOUBLE_TONGUE = 0x1D18A;
   int COMBINING_TRIPLE_TONGUE = 0x1D18B;
   int RINFORZANDO = 0x1D18C;
   int SUBITO = 0x1D18D;
   int Z = 0x1D18E;
   int PIANO = 0x1D18F;
   int MEZZO = 0x1D190;
   int FORTE = 0x1D191;
   int CRESCENDO = 0x1D192;
   int DECRESCENDO = 0x1D193;
   int GRACE_NOTE_SLASH = 0x1D194;
   int GRACE_NOTE_NO_SLASH = 0x1D195;
   int TR = 0x1D196;
   int TURN = 0x1D197;
   int INVERTED_TURN = 0x1D198;
   int TURN_SLASH = 0x1D199;
   int TURN_UP = 0x1D19A;
   int ORNAMENT_STROKE_1 = 0x1D19B;
   int ORNAMENT_STROKE_2 = 0x1D19C;
   int ORNAMENT_STROKE_3 = 0x1D19D;
   int ORNAMENT_STROKE_4 = 0x1D19E;
   int ORNAMENT_STROKE_5 = 0x1D19F;
   int ORNAMENT_STROKE_6 = 0x1D1A0;
   int ORNAMENT_STROKE_7 = 0x1D1A1;
   int ORNAMENT_STROKE_8 = 0x1D1A2;
   int ORNAMENT_STROKE_9 = 0x1D1A3;
   int ORNAMENT_STROKE_10 = 0x1D1A4;
   int ORNAMENT_STROKE_11 = 0x1D1A5;
   int HAUPTSTIMME = 0x1D1A6;
   int NEBENSTIMME = 0x1D1A7;
   int END_OF_STIMME = 0x1D1A8;
   int DEGREE_SLASH = 0x1D1A9;
   int COMBINING_DOWN_BOW = 0x1D1AA;
   int COMBINING_UP_BOW = 0x1D1AB;
   int COMBINING_HARMONIC = 0x1D1AC;
   int COMBINING_SNAP_PIZZICATO = 0x1D1AD;
   int PEDAL_MARK = 0x1D1AE;
   int PEDAL_UP_MARK = 0x1D1AF;
   int HALF_PEDAL_MARK = 0x1D1B0;
   int GLISSANDO_UP = 0x1D1B1;
   int GLISSANDO_DOWN = 0x1D1B2;
   int WITH_FINGERNAILS = 0x1D1B3;
   int DAMP = 0x1D1B4;
   int DAMP_ALL = 0x1D1B5;
   int MAXIMA = 0x1D1B6;
   int LONGA = 0x1D1B7;
   int BREVIS = 0x1D1B8;
   int SEMIBREVIS_WHITE = 0x1D1B9;
   int SEMIBREVIS_BLACK = 0x1D1BA;
   int MINIMA = 0x1D1BB;
   int MINIMA_BLACK = 0x1D1BC;
   int SEMIMINIMA_WHITE = 0x1D1BD;
   int SEMIMINIMA_BLACK = 0x1D1BE;
   int FUSA_WHITE = 0x1D1BF;
   int FUSA_BLACK = 0x1D1C0;
   int LONGA_PERFECTA_REST = 0x1D1C1;
   int LONGA_IMPERFECTA_REST = 0x1D1C2;
   int BREVIS_REST = 0x1D1C3;
   int SEMIBREVIS_REST = 0x1D1C4;
   int MINIMA_REST = 0x1D1C5;
   int SEMIMINIMA_REST = 0x1D1C6;
   int TEMPUS_PERFECTUM_CUM_PROLATIONE_PERFECTA = 0x1D1C7;
   int TEMPUS_PERFECTUM_CUM_PROLATIONE_IMPERFECTA = 0x1D1C8;
   int TEMPUS_PERFECTUM_CUM_PROLATIONE_PERFECTA_DIMINUTION_1 = 0x1D1C9;
   int TEMPUS_IMPERFECTUM_CUM_PROLATIONE_PERFECTA = 0x1D1CA;
   int TEMPUS_IMPERFECTUM_CUM_PROLATIONE_IMPERFECTA = 0x1D1CB;
   int TEMPUS_IMPERFECTUM_CUM_PROLATIONE_IMPERFECTA_DIMINUTION_1 = 0x1D1CC;
   int TEMPUS_IMPERFECTUM_CUM_PROLATIONE_IMPERFECTA_DIMINUTION_2 = 0x1D1CD;
   int TEMPUS_IMPERFECTUM_CUM_PROLATIONE_IMPERFECTA_DIMINUTION_3 = 0x1D1CE;
   int CROIX = 0x1D1CF;
   int GREGORIAN_C_CLEF = 0x1D1D0;
   int GREGORIAN_F_CLEF = 0x1D1D1;
   int SQUARE_B = 0x1D1D2;
   int VIRGA = 0x1D1D3;
   int PODATUS = 0x1D1D4;
   int CLIVIS = 0x1D1D5;
   int SCANDICUS = 0x1D1D6;
   int CLIMACUS = 0x1D1D7;
   int TORCULUS = 0x1D1D8;
   int PORRECTUS = 0x1D1D9;
   int PORRECTUS_FLEXUS = 0x1D1DA;
   int SCANDICUS_FLEXUS = 0x1D1DB;
   int TORCULUS_RESUPINUS = 0x1D1DC;
   int PES_SUBPUNCTIS = 0x1D1DD;
}
