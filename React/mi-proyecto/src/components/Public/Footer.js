import React, { useCallback } from 'react'
import { useState } from 'react'
import './../../App.css';
const Footer = () => {
  const [clicks, setclicks] = useState (0);
  const year = new Date().getFullYear();
  const companyname ="NST Software";
    
  const handleClick = () => {
    setclicks(clicks + 1);
  }

  return (
    <div className="container">
        <footer className="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
        <p className="col-md-4 mb-0 text-muted">&copy; {year} {companyname} clicks={clicks}</p>
        <span
          className= "col-md-4 mb-0 text-muted align-items-center justify-content-center mb3 mb-md-0 me-md-auto link-dark"
          onClick={handleClick}
        >
          <div className="d-flex justify-content-center align-items-center" >
              <img src="perro.png" className="App-logo" alt="logo" />
          </div>
        </span>
        <ul className="nav col-md-4 justify-content-end">
            <li className="nav-item"><a href="#" className="nav-link px-2 text-muted">Home</a></li>
            <li className="nav-item"><a href="#" className="nav-link px-2 text-muted">Features</a></li>
            <li className="nav-item"><a href="#" className="nav-link px-2 text-muted">Pricing</a></li>
            <li className="nav-item"><a href="#" className="nav-link px-2 text-muted">FAQs</a></li>
            <li className="nav-item"><a href="#" className="nav-link px-2 text-muted">About</a></li>
        </ul>
        </footer>
    </div>
  )
}

export default Footer
