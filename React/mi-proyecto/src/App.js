import React, { Component } from 'react';
import  Footer  from './components/Public/Footer';
import  Navbar  from './components/Public/Navbar';
import  Main  from './components/Public/Main';
class App extends Component {
 render() {
 return (
 <div>
    <Navbar />
    {/*---------------------*/}
    <Main />
    <Footer />
  </div>
 );
 }
}
export default App;


