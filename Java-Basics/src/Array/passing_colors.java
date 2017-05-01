package Array;

public class passing_colors {
	
	public static void passingcolors(String[] array){
		
		for (int i=0; i<array.length; i++ ){
			System.out.println(array[i]);
		}
	}
	
	
	public static void main(String[] args) {
		
		String colors[] = {"Red","Blue","Orange","Yellow","Black","White"};
		int colorlength = colors.length;
		passingcolors(colors);
		System.out.println(colorlength);
		
		
		
		
	}

}
