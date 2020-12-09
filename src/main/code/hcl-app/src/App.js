import './App.css';
import logo from './logo.svg';
import Header from './components/header/Header'
import Footer from './components/footer/Footer'
import Middle from './components/middle/Middle'

function App() {
  return (
    <div className="App">
      <Header />
      <Middle />
      <Footer />  
    </div>
  );
}

export default App;
