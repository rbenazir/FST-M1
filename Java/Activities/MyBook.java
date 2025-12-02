package activities;

public class MyBook extends Book {
		static String title="War and Peace";
		public void setTitle(String s) {
		    title = s;
		}
		
		public static void main(String[] args){
			MyBook newNovel=new MyBook();
			//Set title
			newNovel.setTitle(title);

			//Print result
			System.out.println("The title is: " + newNovel.getTitle());
			
		}
	
}
