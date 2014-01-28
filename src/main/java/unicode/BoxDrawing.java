package unicode;
// Kugel's "Java Code & Tools Library", Copyright (c) 1999-2007, Theossos Comp Group

/**
 * Unicode Box Drawing block with characters from u2500 to u257F.
 * @author Kugel, <i>Theossos Comp Group</i>
 * @version Unicode 4.1.0
 */
public interface BoxDrawing
{
   // constant field names modified with "^FORMS " pattern 
   char LIGHT_HORIZONTAL = '\u2500';
   char HEAVY_HORIZONTAL = '\u2501';
   char LIGHT_VERTICAL = '\u2502';
   char HEAVY_VERTICAL = '\u2503';
   char LIGHT_TRIPLE_DASH_HORIZONTAL = '\u2504';
   char HEAVY_TRIPLE_DASH_HORIZONTAL = '\u2505';
   char LIGHT_TRIPLE_DASH_VERTICAL = '\u2506';
   char HEAVY_TRIPLE_DASH_VERTICAL = '\u2507';
   char LIGHT_QUADRUPLE_DASH_HORIZONTAL = '\u2508';
   char HEAVY_QUADRUPLE_DASH_HORIZONTAL = '\u2509';
   char LIGHT_QUADRUPLE_DASH_VERTICAL = '\u250A';
   char HEAVY_QUADRUPLE_DASH_VERTICAL = '\u250B';
   char LIGHT_DOWN_AND_RIGHT = '\u250C';
   char DOWN_LIGHT_AND_RIGHT_HEAVY = '\u250D';
   char DOWN_HEAVY_AND_RIGHT_LIGHT = '\u250E';
   char HEAVY_DOWN_AND_RIGHT = '\u250F';
   char LIGHT_DOWN_AND_LEFT = '\u2510';
   char DOWN_LIGHT_AND_LEFT_HEAVY = '\u2511';
   char DOWN_HEAVY_AND_LEFT_LIGHT = '\u2512';
   char HEAVY_DOWN_AND_LEFT = '\u2513';
   char LIGHT_UP_AND_RIGHT = '\u2514';
   char UP_LIGHT_AND_RIGHT_HEAVY = '\u2515';
   char UP_HEAVY_AND_RIGHT_LIGHT = '\u2516';
   char HEAVY_UP_AND_RIGHT = '\u2517';
   char LIGHT_UP_AND_LEFT = '\u2518';
   char UP_LIGHT_AND_LEFT_HEAVY = '\u2519';
   char UP_HEAVY_AND_LEFT_LIGHT = '\u251A';
   char HEAVY_UP_AND_LEFT = '\u251B';
   char LIGHT_VERTICAL_AND_RIGHT = '\u251C';
   char VERTICAL_LIGHT_AND_RIGHT_HEAVY = '\u251D';
   char UP_HEAVY_AND_RIGHT_DOWN_LIGHT = '\u251E';
   char DOWN_HEAVY_AND_RIGHT_UP_LIGHT = '\u251F';
   char VERTICAL_HEAVY_AND_RIGHT_LIGHT = '\u2520';
   char DOWN_LIGHT_AND_RIGHT_UP_HEAVY = '\u2521';
   char UP_LIGHT_AND_RIGHT_DOWN_HEAVY = '\u2522';
   char HEAVY_VERTICAL_AND_RIGHT = '\u2523';
   char LIGHT_VERTICAL_AND_LEFT = '\u2524';
   char VERTICAL_LIGHT_AND_LEFT_HEAVY = '\u2525';
   char UP_HEAVY_AND_LEFT_DOWN_LIGHT = '\u2526';
   char DOWN_HEAVY_AND_LEFT_UP_LIGHT = '\u2527';
   char VERTICAL_HEAVY_AND_LEFT_LIGHT = '\u2528';
   char DOWN_LIGHT_AND_LEFT_UP_HEAVY = '\u2529';
   char UP_LIGHT_AND_LEFT_DOWN_HEAVY = '\u252A';
   char HEAVY_VERTICAL_AND_LEFT = '\u252B';
   char LIGHT_DOWN_AND_HORIZONTAL = '\u252C';
   char LEFT_HEAVY_AND_RIGHT_DOWN_LIGHT = '\u252D';
   char RIGHT_HEAVY_AND_LEFT_DOWN_LIGHT = '\u252E';
   char DOWN_LIGHT_AND_HORIZONTAL_HEAVY = '\u252F';
   char DOWN_HEAVY_AND_HORIZONTAL_LIGHT = '\u2530';
   char RIGHT_LIGHT_AND_LEFT_DOWN_HEAVY = '\u2531';
   char LEFT_LIGHT_AND_RIGHT_DOWN_HEAVY = '\u2532';
   char HEAVY_DOWN_AND_HORIZONTAL = '\u2533';
   char LIGHT_UP_AND_HORIZONTAL = '\u2534';
   char LEFT_HEAVY_AND_RIGHT_UP_LIGHT = '\u2535';
   char RIGHT_HEAVY_AND_LEFT_UP_LIGHT = '\u2536';
   char UP_LIGHT_AND_HORIZONTAL_HEAVY = '\u2537';
   char UP_HEAVY_AND_HORIZONTAL_LIGHT = '\u2538';
   char RIGHT_LIGHT_AND_LEFT_UP_HEAVY = '\u2539';
   char LEFT_LIGHT_AND_RIGHT_UP_HEAVY = '\u253A';
   char HEAVY_UP_AND_HORIZONTAL = '\u253B';
   char LIGHT_VERTICAL_AND_HORIZONTAL = '\u253C';
   char LEFT_HEAVY_AND_RIGHT_VERTICAL_LIGHT = '\u253D';
   char RIGHT_HEAVY_AND_LEFT_VERTICAL_LIGHT = '\u253E';
   char VERTICAL_LIGHT_AND_HORIZONTAL_HEAVY = '\u253F';
   char UP_HEAVY_AND_DOWN_HORIZONTAL_LIGHT = '\u2540';
   char DOWN_HEAVY_AND_UP_HORIZONTAL_LIGHT = '\u2541';
   char VERTICAL_HEAVY_AND_HORIZONTAL_LIGHT = '\u2542';
   char LEFT_UP_HEAVY_AND_RIGHT_DOWN_LIGHT = '\u2543';
   char RIGHT_UP_HEAVY_AND_LEFT_DOWN_LIGHT = '\u2544';
   char LEFT_DOWN_HEAVY_AND_RIGHT_UP_LIGHT = '\u2545';
   char RIGHT_DOWN_HEAVY_AND_LEFT_UP_LIGHT = '\u2546';
   char DOWN_LIGHT_AND_UP_HORIZONTAL_HEAVY = '\u2547';
   char UP_LIGHT_AND_DOWN_HORIZONTAL_HEAVY = '\u2548';
   char RIGHT_LIGHT_AND_LEFT_VERTICAL_HEAVY = '\u2549';
   char LEFT_LIGHT_AND_RIGHT_VERTICAL_HEAVY = '\u254A';
   char HEAVY_VERTICAL_AND_HORIZONTAL = '\u254B';
   char LIGHT_DOUBLE_DASH_HORIZONTAL = '\u254C';
   char HEAVY_DOUBLE_DASH_HORIZONTAL = '\u254D';
   char LIGHT_DOUBLE_DASH_VERTICAL = '\u254E';
   char HEAVY_DOUBLE_DASH_VERTICAL = '\u254F';
   char DOUBLE_HORIZONTAL = '\u2550';
   char DOUBLE_VERTICAL = '\u2551';
   char DOWN_SINGLE_AND_RIGHT_DOUBLE = '\u2552';
   char DOWN_DOUBLE_AND_RIGHT_SINGLE = '\u2553';
   char DOUBLE_DOWN_AND_RIGHT = '\u2554';
   char DOWN_SINGLE_AND_LEFT_DOUBLE = '\u2555';
   char DOWN_DOUBLE_AND_LEFT_SINGLE = '\u2556';
   char DOUBLE_DOWN_AND_LEFT = '\u2557';
   char UP_SINGLE_AND_RIGHT_DOUBLE = '\u2558';
   char UP_DOUBLE_AND_RIGHT_SINGLE = '\u2559';
   char DOUBLE_UP_AND_RIGHT = '\u255A';
   char UP_SINGLE_AND_LEFT_DOUBLE = '\u255B';
   char UP_DOUBLE_AND_LEFT_SINGLE = '\u255C';
   char DOUBLE_UP_AND_LEFT = '\u255D';
   char VERTICAL_SINGLE_AND_RIGHT_DOUBLE = '\u255E';
   char VERTICAL_DOUBLE_AND_RIGHT_SINGLE = '\u255F';
   char DOUBLE_VERTICAL_AND_RIGHT = '\u2560';
   char VERTICAL_SINGLE_AND_LEFT_DOUBLE = '\u2561';
   char VERTICAL_DOUBLE_AND_LEFT_SINGLE = '\u2562';
   char DOUBLE_VERTICAL_AND_LEFT = '\u2563';
   char DOWN_SINGLE_AND_HORIZONTAL_DOUBLE = '\u2564';
   char DOWN_DOUBLE_AND_HORIZONTAL_SINGLE = '\u2565';
   char DOUBLE_DOWN_AND_HORIZONTAL = '\u2566';
   char UP_SINGLE_AND_HORIZONTAL_DOUBLE = '\u2567';
   char UP_DOUBLE_AND_HORIZONTAL_SINGLE = '\u2568';
   char DOUBLE_UP_AND_HORIZONTAL = '\u2569';
   char VERTICAL_SINGLE_AND_HORIZONTAL_DOUBLE = '\u256A';
   char VERTICAL_DOUBLE_AND_HORIZONTAL_SINGLE = '\u256B';
   char DOUBLE_VERTICAL_AND_HORIZONTAL = '\u256C';
   char LIGHT_ARC_DOWN_AND_RIGHT = '\u256D';
   char LIGHT_ARC_DOWN_AND_LEFT = '\u256E';
   char LIGHT_ARC_UP_AND_LEFT = '\u256F';
   char LIGHT_ARC_UP_AND_RIGHT = '\u2570';
   char LIGHT_DIAGONAL_UPPER_RIGHT_TO_LOWER_LEFT = '\u2571';
   char LIGHT_DIAGONAL_UPPER_LEFT_TO_LOWER_RIGHT = '\u2572';
   char LIGHT_DIAGONAL_CROSS = '\u2573';
   char LIGHT_LEFT = '\u2574';
   char LIGHT_UP = '\u2575';
   char LIGHT_RIGHT = '\u2576';
   char LIGHT_DOWN = '\u2577';
   char HEAVY_LEFT = '\u2578';
   char HEAVY_UP = '\u2579';
   char HEAVY_RIGHT = '\u257A';
   char HEAVY_DOWN = '\u257B';
   char LIGHT_LEFT_AND_HEAVY_RIGHT = '\u257C';
   char LIGHT_UP_AND_HEAVY_DOWN = '\u257D';
   char HEAVY_LEFT_AND_LIGHT_RIGHT = '\u257E';
   char HEAVY_UP_AND_LIGHT_DOWN = '\u257F';
}