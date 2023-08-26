import React from 'react'
import Card from './Card'

const Cards = () => {
  return (
    <div className="album py-5 bg-light">
            <div className="container">

                <div className="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
                    <Card />  
                    <Card />
                    <Card />
                    <Card />
                    <Card />
                    <Card />
                </div>
            </div>
    </div>
  )
}

export default Cards
