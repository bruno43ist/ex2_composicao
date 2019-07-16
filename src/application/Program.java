package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		String title1 = "Traveling to New Zealand";
		String title2 = "Good night guys";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date date1 = sdf.parse("21/06/2018 13:05:44");
		Date date2 = sdf.parse("28/07/2018 23:14:19");
		
		int likes1 = 12;
		int likes2 = 5;
		
		String content1 = "I'm going to visit this wonderful country!";
		String content2 = "See you tomorrow!";
		
		Comment Comment1 = new Comment("Have a nice trip! ");
		Comment Comment2 = new Comment("Wow that's awesome");
		Comment Comment3 = new Comment("Good night ");
		Comment Comment4 = new Comment("May the Force be with you");
		
		
		Post p1 = new Post(date1,title1,content1,likes1);
		Post p2 = new Post(date2,title2,content2,likes2);
		
		p1.addComment(Comment1);
		p1.addComment(Comment2);
		p2.addComment(Comment3);
		p2.addComment(Comment4);
		
	
		System.out.println(p1);
		System.out.println(p2);
		
		

	}

}
