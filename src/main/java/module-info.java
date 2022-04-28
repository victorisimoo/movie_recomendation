module com.movie.movie_recommendation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.movie.movie_recommendation to javafx.fxml;
    exports com.movie.movie_recommendation;
}