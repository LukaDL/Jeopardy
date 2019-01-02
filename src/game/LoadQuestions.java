package game;

public class LoadQuestions {
	
	Question[] questions = new Question[25];
	
	public Question[] load() {
		questions[0] = new Question("Looney Toons", "Bugs _______", "Rabbit", "Bunny", "Hare", "Wabbit", "Bunny", 100);
		questions[1] = new Question("NBA", "The best dunker of all time", "Vince Carter", "Oliver Miller", "Steve Kerr", "Rafael Araujo", "Vince Carter", 100);
		questions[2] = new Question("Canada", "The capital city of Canada", "Ottawa", "Toronto", "Montreal", "Kanata", "Ottawa", 100);
		questions[3] = new Question("Music", "This singer was known as the \"King of Pop\"", "Rick James", "Bruno Mars", "Michael Jackson", "Kanye West", "Michael Jackson", 100);
		questions[4] = new Question("Movies", "In 1982, this Stephen Spielberg directed film had this character phone home", "Gremlin", "E.T.", "Alf", "Sloth", "E.T.", 100);
		questions[5] = new Question("Looney Toons", "Wile E. _______", "Whale", "Devil", "Walrus", "Coyote", "Coyote", 200);
		questions[6] = new Question("NBA", "The GOAT", "Lebron James", "Kobe Bryant", "Magic Johnson", "Michael Jordan", "Michael Jordan", 200);
		questions[7] = new Question("Canada", "As of 2018, Canada has this many NHL teams", "6", "7", "8", "5", "7", 200);
		questions[8] = new Question("Music", "This band can't get no satisfaction", "The Rolling Stones", "The Beatles", "Pink Floyd", "Led Zeppelin", "The Rolling Stones", 200);
		questions[9] = new Question("Movies", "This is the highest grossing film of all time", "Avatar", "Titanic", "Star Wars: The Force Awakens", "Avengers: Infinity War", "Avatar", 200);
		questions[10] = new Question("Looney Toons", "Marvin is a", "Scuba Diver", "Gladiator", "Monster", "Martian", "Martian", 300);
		questions[11] = new Question("NBA", "This player scored 100 points in a single game", "Walt Frazer", "Wilt Chamberlain", "Julius Erving", "Bill Russell", "Wilt Chamberlain", 300);
		questions[12] = new Question("Canada", "This city hosted the 2010 Winter Olympics", "Vancouver", "Winnepeg", "Edmonton", "Calgary", "Vancouver", 300);
		questions[13] = new Question("Music", "This music scene was big in the early 90's", "Motown", "Indy", "Grunge", "Disco", "Grunge", 300);
		questions[14] = new Question("Movies", "This 90's prison movie was directed Frank Darabont", "The Shawshank Redemption", "Prison Break", "The Rock", "Con Air", "The Shawshank Redemption", 300);
		questions[15] = new Question("Looney Toons", "This character's catch phrase is \"Sufferin Succotash\"", "Road Runner", "Sylvester", "Daffy Duck", "Porky Pig", "Sylvester", 400);
		questions[16] = new Question("NBA", "The dominant big man that won three championships with Kobe Bryant", "Pau Gasol", "Karl Malone", "Shaquille O'Neal", "Kareem Abdul-Jabbar", "Shaquille O'Neal", 400);
		questions[17] = new Question("Canada", "This singer sang about how her heart will go on", "Avril Lavigne", "Anne Murray", "Nelly Furtato", "Celine Dion", "Celine Dion", 400);
		questions[18] = new Question("Music", "This member of the three tenors passed away in 2007", "Luciano Pavarotti", "Jose Carreras", "Placido Domingo", "Jose Calderon", "Luciano Pavarotti", 400);
		questions[19] = new Question("Movies", "The Butabi brothers were characters in this movie starring Will Ferrell", "Old School", "A Night at the Roxbury", "Anchorman", "Step Brothers", "A Night at the Roxbury", 400);
		questions[20] = new Question("Looney Toons", "Elmer _______", "Fudd", "Smith", "Glue", "Amber", "Fudd", 500);
		questions[21] = new Question("NBA", "His nickname was Mighty Mouse", "Shawn Kemp", "Gary Payton", "Damon Stoudamire", "Detlef Schrempf", "Damon Stoudamire", 500);
		questions[22] = new Question("Canada", "This man ran in the marathon of hope", "Don Cherry", "Terry Fox", "Peter Mansbridge", "Rick Mercer", "Terry Fox", 500);
		questions[23] = new Question("Music", "This former Nirvana drummer is currently the front man for one of the biggest rock bands in the world", "Mick Jagger", "Paul McCartney", "Eddie Vedder", "Dave Grohl", "Dave Grohl", 500);
		questions[24] = new Question("Movies", "This movie about jazz students and an abusive instructor won an Academy Award for Best Picture", "Drumline", "The Rocker", "Spinal Tap", "Whiplash", "Whiplash", 500);
		
		return questions;
	}
}
