package Graph;

public class FloodFillAlgorithm {


	public static void main(String[] args) {
		int[][]image = {
				{1,1,1,2,2},
				{1,1,1,2,2},
				{1,1,2,2,2},
				{3,3,3,3,3},
				{3,3,3,3,3}
		};
		System.out.println("original Image ;");
		printImage(image);
		
		int startRow = 2,startCol =2;
		int oldColour = image[startRow][startCol];
		int newColour = 4;
		
		floodFill(image,startRow,startCol,oldColour,newColour);
		
		System.out.println("\nImage after Flood Fill :");
		printImage(image);
	}
	public static void floodFill(int [][] image,int row,int col,int oldColour,int newColour) {
	int rows = image.length;
	int cols =image[0].length;
	
	if (row<0||col>=rows||col<0||col>=cols||image[row][col]!=oldColour) {
		return;
	}
	image[row][col]=newColour;
	
	floodFill(image,row+1,col,oldColour,newColour);
	floodFill(image,row-1,col,oldColour,newColour);
	floodFill(image,row,col+1,oldColour,newColour);
	floodFill(image,row,col-1,oldColour,newColour);
	}
	
	public static void printImage(int[][]image) {
		for (int[] row:image) {
			for(int pixel:row) {
				System.out.print(pixel+" ");
			}
			System.out.println();
		}
      }
	}