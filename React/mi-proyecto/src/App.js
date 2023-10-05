import React, { Component } from 'react';
import { Routes, Route, Router } from 'react-router-dom';

import  Footer  from './components/Public/Footer';
import  Navbar  from './components/Public/Navbar';
import  Main  from './components/Public/Main';
import Detail from './components/Public/Detail';
import UserForm from './components/Public/UserForm';
class App extends Component {
 render() {
 return (
 <div>
    <Navbar />
    <Routes>
      <Route exact path={"/"} element={<Main/>} />
      <Route path={"/details/:id"} element={Detail}/>
      <Route path={"/user-form"} element= {UserForm}/>  
    </Routes>
    <Footer />
  </div>
 );
 }
}
export default App;


