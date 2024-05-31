import './App.css';
import {BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import FooterComponent from './components/Footer';
import HeaderComponent from './components/Header';
import ListEmployee from './components/ListEmployee';
import AddEmployee from './components/AddEmployee';

function App() {
  return (
    <div>
      <Router>
        <HeaderComponent />
        <div className= "container">
          <Routes>
              <Route exact path = "/" element = {<ListEmployee />}></Route>
              <Route path = "/employees" element = {<ListEmployee />}></Route>
              <Route path = "/add-employee" element = {<AddEmployee />}> </Route>
              <Route path = "/edit-employee/:id" element = {<AddEmployee />}></Route>
              </Routes>

        </div>
       
        <FooterComponent />
        </Router>
    </div>
  );
}

export default App;