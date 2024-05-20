import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][]  originalArray = new int[R][C];
        for(int i=0;i<R;i++){
            for(int j =0;j<C;j++){
                originalArray[i][j] = sc.nextInt();
            }
        }
        // ตำแหน่งที่สนใจ
        int targetRow = sc.nextInt(); // แถวที่สนใจ
        int targetCol = sc.nextInt(); // หลักที่สนใจ

        // ขนาดของอาเรย์ที่ต้องการ
        int desiredRows = sc.nextInt();
        int desiredCols = sc.nextInt();

        // ตรวจสอบว่าตำแหน่งที่สนใจอยู่ในขอบเขตของอาเรย์หรือไม่
        if (targetRow >= 0 && targetRow < originalArray.length && targetCol >= 0 && targetCol < originalArray[0].length) {
            // คำนวณตำแหน่งเริ่มต้นของกรอบที่ต้องการตัด
            int startRow = Math.max(targetRow - desiredRows + 1, 0);
            int startCol = Math.max(targetCol - desiredCols + 1, 0);

            // ตรวจสอบขนาดของอาเรย์ที่ต้องการตัด
            int actualRows = Math.min(desiredRows, originalArray.length - startRow);
            int actualCols = Math.min(desiredCols, originalArray[0].length - startCol);

            // สร้างอาเรย์ที่ต้องการ
            int[][] resultArray = new int[actualRows][actualCols];

            // คัดเลือกข้อมูลจากอาเรย์ต้นฉบับ
            for (int i = 0; i < actualRows; i++) {
                for (int j = 0; j < actualCols; j++) {
                    resultArray[i][j] = originalArray[startRow + i][startCol + j];
                }
            }

            // พิมพ์ผลลัพธ์
            System.out.println("ผลลัพธ์ที่ต้องการ:");
            for (int i = 0; i < resultArray.length; i++) {
                for (int j = 0; j < resultArray[0].length; j++) {
                    System.out.print(resultArray[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("invalid");
        }
    }
}
