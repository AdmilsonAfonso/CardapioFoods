import React from 'react'
import './card.css'

function Card({title,price}) {

  

  return (
    <div className='card'>
        <img />
        <h2>{title}</h2>
        <p><b>{price}</b></p>
    </div>
  )
}


export default Card;