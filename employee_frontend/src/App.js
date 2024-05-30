import './App.css';
import {BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import FooterComponent from './components/Footer';
import HeaderComponent from './components/Header';
import ListEmployee from './components/ListEmployee';

function App() {
  return (
    <div>
      <Router>
        <HeaderComponent />
        <div className= "container">
          <Routes>
              <Route exact path = "/" element = {<ListEmployee />}></Route>
              <Route path = "/employees" element = {<ListEmployee />}></Route>
              </Routes>

        </div>
       
        <FooterComponent />
        </Router>
    </div>
  );
}

export default App;