class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Set<Character> checkSet;

        //row wise
        for(int i = 0; i< 9; i++) {
            checkSet = new HashSet<>();
            for(int j = 0; j<9; j++) {
                if(board[i][j] != '.') {
                    if(checkSet.contains(board[i][j])) {
                        return false;    
                    }
                    checkSet.add(board[i][j]);
                }
            }
        }

        //col wise
        for(int j = 0; j< 9; j++) {
            checkSet = new HashSet<>();
            for(int i = 0; i<9; i++) {
                if(board[i][j] != '.') {
                    if(checkSet.contains(board[i][j])) {
                        return false;    
                    }
                    checkSet.add(board[i][j]);
                }
            }
        }

        //box wise
        for(int rowMin = 0; rowMin < 9; rowMin=rowMin+3) {
            for(int colMin = 0; colMin < 9; colMin=colMin+3) {
                checkSet = new HashSet<>();
                for(int i=rowMin; i < rowMin+3; i++) {
                    for(int j=colMin; j < colMin+3; j++) {
                        if(board[i][j] != '.') {
                            if(checkSet.contains(board[i][j])) {
                                return false;    
                            }
                            checkSet.add(board[i][j]);
                        }
                    }
                }
            }
        }
        return true;
    }
}
