import './App.css'
import Home from './components/Home'
import ListGroup from './components/ListGroup'
import Alert from './components/Alert'
import Button from './components/Button'
import Navbar from './components/Navbar'
import { useState } from 'react'

const backlog = [
  "Red dead redemption 2",
  "The witcher 3",
  "Clair obscur Expedition 33",
  "Bloodborne",
  "Monster hunter world"
]

const wishlist = [
  "Elden Ring",
  "Persona 5",
  "Hollow Knight"
]

const handleSelectGame = (game: string) => {
  console.log(game);
}

function App() {

  const[alertVisible, setAlertVisible] = useState(false);

  return (
    <>
      <div><Navbar/></div>
      <div><Button onClick={() => setAlertVisible(true)}>Se connecter</Button></div>
      <div><ListGroup games={backlog} heading="Backlog" onSelectGame={handleSelectGame}/></div>
      <div><ListGroup games={wishlist} heading="Wishlist" onSelectGame={handleSelectGame}/></div>
      {alertVisible && <Alert onClick={() => setAlertVisible(false)}> Hello World!</Alert>}
    </>
  );
}

export default App
