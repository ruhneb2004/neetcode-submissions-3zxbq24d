class Solution {
    public boolean isValidSudoku(char[][] board) {
        int count = 9;
        Set<Character>[] rowSet = new HashSet[count];
        Set<Character>[] colSet = new HashSet[count];
        Set<Character>[] squareSet = new HashSet[count];


        for(int i = 0; i < count; i ++) {
            rowSet[i] = new HashSet<>();
            colSet[i] = new HashSet<>();
            squareSet[i] = new HashSet<>();
        }

        for(int i = 0; i < count; i ++) {
            for(int j = 0; j < count; j ++) {

                int sqIndex = (i/3) * 3 + (j/3);
                char val = board[i][j];

                if(val == '.') continue;

                if( !rowSet[i].add(val)) {
                    return false;
                }
                if (!colSet[j].add(val)) {
                    return false;
                }
                if (!squareSet[sqIndex].add(val)) {
                    return false;
                }
            }
        }
        return true;
    }
}
