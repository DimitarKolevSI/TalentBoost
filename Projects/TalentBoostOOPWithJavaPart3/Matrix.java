public class Matrix {
    public int[][] matrix;
    Matrix()
    {
        matrix = new int[3][3];
    }
    Matrix(int size)
    {
        matrix = new int[size][size];
    }
    Matrix(int rows,int columns)
    {
        matrix = new int[rows][columns];
    }
    boolean isSquare()
    {
        if(matrix.length == matrix[0].length) return true;
        return false;
    }
    int getElement(int rows, int columns)
    {
        if(rows < 0 || rows >= matrix.length || columns < 0 || columns >= matrix[0].length) return -1;
        return matrix[rows][columns];
    }
    int getRows()
    {
        return matrix.length;
    }
    int getColumns()
    {
        return matrix[0].length;
    }

}
