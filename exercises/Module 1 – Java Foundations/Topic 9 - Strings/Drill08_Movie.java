public class Drill08_Movie {
    
    static class Movie {
        String title;
        String genre;
        int rating;

        boolean isRecommended() {
            return rating >= 8;
        }
    }

    public static void main(String[] args) {
        Movie[] movies = new Movie[5];

        movies[0] = new Movie();
        movies[0].title = "The Shawshank Redemption";
        movies[0].genre = "Drama";
        movies[0].rating = 9;

        movies[1] = new Movie();
        movies[1].title = "The Room";
        movies[1].genre = "Drama";
        movies[1].rating = 3;

        movies[2] = new Movie();
        movies[2].title = "Inception";
        movies[2].genre = "Sci-Fi";
        movies[2].rating = 8;

        movies[3] = new Movie();
        movies[3].title = "Paddington 2";
        movies[3].genre = "Comedy";
        movies[3].rating = 8;

        movies[4] = new Movie();
        movies[4].title = "Morbius";
        movies[4].genre = "Action";
        movies[4].rating = 5;

        for(int i = 0; i < movies.length; i++) {
            System.out.println("Title: " + movies[i].title);
            System.out.println("Genre: " + movies[i].genre);
            System.out.println("Rating: " + movies[i].rating);
            System.out.println("Recommended: " + movies[i].isRecommended());
            System.out.println();
        }
    }
}