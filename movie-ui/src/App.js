import './App.css';
import api from './api/axiosConfig';
import { useState, useEffect } from 'react';
import Layout from './components/Layout';
import { Routes, Route } from 'react-router-dom';
import Home from './components/Home';

function App() {

  const [movies, setMovies] = useState();

  const getMovies = async () => {
    try {
      const response = await api.get('/movies');
      setMovies(response.data);
    }
    catch (err) {
      console.log(err);
    }
  }

  useEffect(() => {
    getMovies(); //Will execute when the app first loads
  }, [])

  return (
    <div className="App">
      <Routes>
        <Route path="/" element={<Layout />}>
          <Route path='/home' element={<Home />}></Route>
        </Route>
      </Routes>
    </div>
  );
}

export default App;
