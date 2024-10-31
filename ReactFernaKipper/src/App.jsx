import { useEffect, useState } from 'react'
import './App.css'
import Card from './componente/cards/card'
import { ListaF } from './axios/Lista'



function App() {

  const [foods, setFoods]= useState([])

  const getFoods = async() =>{
    try {
      const response = await ListaF.get('/foods')
      const n = response.data
      setFoods(n)
        console.log(n)
    } catch (error) {
      console.log(error)
    }
  }

  useEffect(() =>{
    getFoods()
},[])


  return (
    <div className="container">
      <h1>Cardápio</h1>
      <div className="card-grid">
      {foods.length === 0 ? <p>carregando</p> : (
      foods.map((post)=>(
        <div className="post" key={post.id}>
          <Card title={post.title} price={post.price}/>
        </div>
      ))
    )}
      </div>
    </div>
  )
}

export default App
