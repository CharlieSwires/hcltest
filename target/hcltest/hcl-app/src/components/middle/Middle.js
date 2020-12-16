import './Middle.css';
import React, { Component } from 'react';

class Middle extends Component {
    constructor(props) {
      super(props);
      this.state = 
        {
          count: null,
          o1:null,
          o2:null
        };
      
        this.fetchAdd = this.fetchAdd.bind(this);
        this.fetchSubtract = this.fetchSubtract.bind(this);
        this.fetchMultiply = this.fetchMultiply.bind(this);
        this.fetchDivide = this.fetchDivide.bind(this);
        this.fetchAnything = this.fetchAnything.bind(this);
      }
  

    fetchAnything(s1) {
      const testURL = 'http://localhost:8888/hcltest/hcl/'+s1+'/'+this.state.o1+'/'+this.state.o2;
      console.log("testURL", testURL);
  
      const myInit = {
        method: 'GET',
         // mode: 'no-cors',
          headers: { 'content-type':'application/json'
          }
      };
  
      const myRequest = new Request(testURL, myInit);
          fetch(myRequest)
            .then( async response => {const data = await response.json();
              this.setState({count: data.count});
            })
            .catch( error => {
              console.log(error)
            });
          
      }
 
      fetchAdd() {
        this.fetchAnything('add');
      };
      fetchSubtract() {
        this.fetchAnything('subtract');
      };
      fetchMultiply(){
        this.fetchAnything('multiply');
      };
      fetchDivide() {
        this.fetchAnything('divide');
      };
      
    myChangeHandlero1 = (event) => {
      this.setState({o1: event.target.value});
      console.log('o1='+this.state.o1)
    }
    myChangeHandlero2 = (event) => {
      this.setState({o2: event.target.value});
      console.log('o2='+this.state.o2)
    }
render() {
   
    return (
      <div>
        <p>add  <input type='text' onChange={this.myChangeHandlero1} /> to 
        <input type='text' onChange={this.myChangeHandlero2} /></p>
        <button onClick={this.fetchAdd}>
          Click me
        </button>     
        <p>subtract  <input type='text' onChange={this.myChangeHandlero1} /> to 
        <input type='text' onChange={this.myChangeHandlero2} /></p>
        <button onClick={this.fetchSubtract}>
          Click me
        </button>     
        <p>multiply  <input type='text' onChange={this.myChangeHandlero1} /> to 
        <input type='text' onChange={this.myChangeHandlero2} /></p>
        <button onClick={this.fetchMultiply}>
          Click me
        </button>     
        <p>divide <input type='text' onChange={this.myChangeHandlero1} /> to 
        <input type='text' onChange={this.myChangeHandlero2} /> </p>
        <button onClick={this.fetchDivide}>
          Click me
        </button>
        <p><b>= {this.state.count}</b></p>
      </div>
    );
  }
}
  export default Middle;
