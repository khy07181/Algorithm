public class sol2 {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] intArr = new int[rows][columns];
        int num = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                intArr[i][j] = num;
                num++;
            }
        }
        for(int i = 0; i < queries.length; i++) {
            int[] query = new int[4];
            query[0] = queries[i][0] - 1;
            query[1] = queries[i][1] - 1;
            query[2] = queries[i][2] - 1;
            query[3] = queries[i][3] - 1;
            int min = 0;

            intArr = rotation(intArr, query);

            for(int j = query[0]; j < query[2]; j++) {
                for(int k = query[1]; k < query[3]; k++) {
                    if(intArr[j][k] < min) {
                        min = intArr[j][k];
                    }
                }
            }

            answer[i] = min;
        }

        return answer;
    }

    public static int[][] rotation(int[][] intArr, int[] query) {
        int x1 = query[0];
        int y1 = query[1] ;
        int x2 = query[2] ;
        int y2 = query[3] ;
        int temp1 = intArr[x1][y2];
        int temp2 = intArr[x2][y2];
        int temp3 = intArr[x2][y1];
        int temp4 = intArr[x1][y1];
        for (int i = y2; i > y1; i--) {
            intArr[x1][i] = intArr[x1][i - 1];
        }

        for (int i = x2; i > x1 + 1; i--) {
            intArr[i][y2] = intArr[i - 1][y2];
        }
        intArr[x1 + 1][y2] = temp1;

        for (int i = y1; i < y2 - 1; i++) {
            intArr[x2][i] = intArr[x2][i + 1];
        }
        intArr[x2][y2 - 1] = temp2;

        for (int i = x1; i < x2 - 1; i++) {
            intArr[i][y1] = intArr[i + 1][y1];
        }
        intArr[x2 - 1][y1] = temp3;
        intArr[x1][y1 + 1] = temp4;

        return intArr;
    }

}
