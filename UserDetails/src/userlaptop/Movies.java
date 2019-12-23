package userlaptop;

public class Movies {
	
	
	private String MovieName;
	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movies(String movieName) {
		super();
		MovieName = movieName;
	}
	public String getMovieName() {
		return MovieName;
	}
	public void setMovieName(String movieName) {
		MovieName = movieName;
	}
	@Override
	public String toString() {
		return "Movie [MovieName=" + MovieName + "]";
	}
	
	
	
	
}
