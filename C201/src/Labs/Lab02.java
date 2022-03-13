public class Lab02
{
    public static void main(String[] args)
    {
        int x = 3;
        int y = 5;

        int[][] twoDA1 = new int[x][y];
        int[] oneDA = new int[x*y];
        int[][] twoDA2 = new int[x][y];
        int[][] twoDA3 = new int[y][x];


        InputArray(twoDA1);
        System.out.println("Contents of two dimensional array 1:");
        Output2DArray(twoDA1);               

        CopyArray(twoDA1, oneDA);
        System.out.println("contents of one dimensional array:");
        Output1DArray(oneDA);

        CopyArrayRotate180degrees(twoDA1, twoDA2);
        System.out.println("Contents of two dimensional array 2:");
        Output2DArray(twoDA2); 

        CopyArrayRotate90degreesclockwise(twoDA1, twoDA3);
        System.out.println("Contents of two dimensional array 3:");
        Output2DArray(twoDA3);
    }

    static void InputArray(int[][] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[0].length; j++)
            {
                a[i][j] = i*2 + j;
            }
        }
    }

    static void Output1DArray(int[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+ "\t");
        }

        System.out.print("\n\n");
    }

    static void Output2DArray(int[][] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            for (int j=0; j<a[0].length; j++)
            {
                System.out.print(a[i][j]+ "\t");
            }

            System.out.print("\n");
        }

        System.out.print("\n");
    }
    
    static void CopyArray(int[][] a, int[] b)
    {
        for (int column = 0; column < a.length; column++) {
            for (int row = 0; row < a[column].length; row++) {
                b[(column * 5) + row] = a[column][row];
            }
        }
    }
    
    static void CopyArrayRotate180degrees(int[][] a, int[][] b)
    {
        for (int column = 0; column < a.length; column++) {
            for (int row = 0; row < a[column].length; row++) {
                b[b.length - column - 1] [b[column].length - row - 1] = a[column][row];
            }
        }
    }
    
    static void CopyArrayRotate90degreesclockwise(int[][] a, int[][] b)
    {
        for (int column = 0; column < a.length; column++) {
            for (int row = 0; row < a[column].length; row++) {
                b[row][b[row].length - column - 1] = a[column][row];
            }
        }
        // copy contents of 90 degrees clockwise rotated two dimensional array a
        // into two dimensional array b
    }
}

/* output of the program should look like

Contents of two dimensional array 1:
0	1	2	3	4	
2	3	4	5	6	
4	5	6	7	8	

contents of one dimensional array:
0	1	2	3	4	2	3	4	5	6	4	5	6	7	8	

Contents of two dimensional array 2:
8	7	6	5	4	
6	5	4	3	2	
4	3	2	1	0	

Contents of two dimensional array 3:
4	2	0	
5	3	1	
6	4	2	
7	5	3	
8	6	4	

*/
	
	