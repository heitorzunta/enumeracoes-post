package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
 
		Date moment1 = sdf.parse("21/06/2018 13:05:44");
		String title1 = "Traveling to New Zealand";
		String content1 = "I'm goign to visit this wonderful country!";
		int linkes1 = 12;
		
		Post post1 = new Post(moment1, title1, content1, linkes1);
		
		post1.addComment(new Comment("Have a nice trip"));
		post1.addComment(new Comment("Wow that's awesome!"));
		
		System.out.println(post1);
	}

}
