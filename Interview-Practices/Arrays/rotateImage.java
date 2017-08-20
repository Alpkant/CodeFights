int[][] rotateImage(int[][] a) {
    int col = a.length;
        int[][] d= new int[col][col];

        for(int i =0; i<col ; i++){
                for (int j  = 0; j <col; j++){
        		d[i][j] =a[col-1-j][i];
                      }
        
        }
        return d;
}
