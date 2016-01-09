class Drama extends Movies {

}

class Crime extends Movies {

}

class Action extends Movies {

}

public class Movies {

	String director;
	String year;
	double imdbScore;

	public double getimdbScore() {
		return imdbScore;
	}

	public void setImdbScore(double score) {
		this.imdbScore = score;
	}

	public static void main(String[] args) {

		Drama theGodFather = new Drama();
		Crime TwelveAngryMan = new Crime();
		Action SevenSamurai = new Action();

		// list of movies from different class!
		Movies[] moviesList = new Movies[3];

		moviesList[0] = theGodFather;
		moviesList[1] = TwelveAngryMan;
		moviesList[2] = SevenSamurai;

		theGodFather.setImdbScore(9.2);
		TwelveAngryMan.setImdbScore(8.9);
		SevenSamurai.setImdbScore(8.7);

		for (Movies movie : moviesList) {

			System.out.println(movie.imdbScore);

		}

	}

}
