//  package Assignment4;

public class Exercise1 {

	public static void main(String[] args) {
		
		char array[][] = {{'A','B','C','D','E','F','G','H','I','J'},
				          {'K','L','M','N','O','P','Q','R','S','T'},
				          {'U','V','W','X','Y','Z','A','B','C','D'},
				          {'E','F','G','H','I','J','K','L','M','N'},
				          {'O','P','Q','R','S','T','U','V','W','X'},
				          {'Y','Z','A','B','C','D','E','F','G','H'},
				          {'I','J','K','L','O','M','N','O','P','Q'},
				          {'R','S','T','U','V','W','X','Y','Z','A'},
				          {'B','C','D','E','F','G','H','I','J','K'},
				          {'L','M','N','O','P','Q','R','S','T','U'}};
		

		for(int i= 0; i< array.length; i++){
			
			for(int j= 0; j< array[i].length; j++)
			{
				char i1 = (char)(Math.random() * array.length);
				char j1 = (char)(Math.random() * array[i].length);
				System.out.print(array[i1][j1]+" ");
		     }
		System.out.println();
		}
		

	}

}
   