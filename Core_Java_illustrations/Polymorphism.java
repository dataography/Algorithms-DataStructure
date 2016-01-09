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

		// movieList is an array of object type Movies
		Movies[] moviesList = new Movies[3];

                //yet element of the movies can be a different objects(instance of a genre) as follow:
		moviesList[0] = theGodFather;
		moviesList[1] = TwelveAngryMan;
		moviesList[2] = SevenSamurai;
		//which is because of each object is a instance of a genre which extends  Movies Class


		theGodFather.setImdbScore(9.2);
		TwelveAngryMan.setImdbScore(8.9);
		SevenSamurai.setImdbScore(8.7);

		for (Movies movie : moviesList) {

			System.out.println(movie.imdbScore);

		}

	}

}
