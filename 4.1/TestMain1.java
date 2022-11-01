class AdditionNotPossibleException extends Exception{
    AdditionNotPossibleException(String s)
    {
        super(s);
    }
}

class Matrix {
    int row,col;
    int[][] matrix;
    Matrix(int row,int col,int[][] matrix)
    {
        this.row = row;
        this.col = col;
        this.matrix = matrix;
    }
    int getElementAt(int r,int c)
    {
        return matrix[r][c];
    }
    void setElementAt(int r,int c,int element)
    {
        matrix[r][c] = element;
        System.out.println("Success!");
    }
    String findItem(int item)
    {
        String s;
        int flag = 0,i = 0 ,j = 0;
        for(i = 0;i<row;i++)
        {
            for(j = 0;j<col;j++)
            {
                if(matrix[i][j] == item)
                {
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 1) s = "ELement found at row = " + i + " and " + " column = "+j;
        else s =  "element not found";
        return s;
    }
    int[][] add(int[][] matrix2)
    {
        int[][] matrix3 = new int[row][col];
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                matrix3[i][j] = matrix[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Matrix added successfully!");
        return matrix3;
    }
}
class TestMain1{
    public static void main(String args[])
    {
        int row = 3,col = 3;
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        Matrix m = new Matrix(row,col,matrix);
        System.out.println(m.getElementAt(2,1));
        m.setElementAt(2,1,80);
        System.out.println(m.getElementAt(2,1));
        System.out.println(m.findItem(8));
        System.out.println(m.findItem(80));
        
        int newRow = 4,newColumn = 4;
        int[][] Newmatrix = {{10,11,12,19},{13,14,15,20},{16,17,18,21}};
        try{
            if(newRow != row && newColumn != col)
            {
                throw new AdditionNotPossibleException("Matrix size is not equal!");
            }
            else
            {
                int[][] matrix3 = m.add(Newmatrix);
            }
        }catch(AdditionNotPossibleException e)
        {
            System.out.println(e);
        }
    }
}
