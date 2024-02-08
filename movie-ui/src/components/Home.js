import React from 'react';
import ListOfMovies from './ListOfMovies';

//rafce command on VS Code

const Home = ({ homeMovies }) => {
    return (
        <ListOfMovies movies={homeMovies} />
    )
}

export default Home;