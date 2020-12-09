import './Middle.css';
import React, { Component } from 'react';

class Middle extends Component {
    constructor(props) {
      super(props);
      this.state = {
        fetchUser: {
          count: ''
        }
      }
      this.fetchUser = this.fetchUser.bind(this);
    }
  

    fetchUser() {
    const testURL = 'https://localhost:8080/hcl/add/2/5';
	const myInit = {
		method: 'GET',
        mode: 'no-cors',
        headers: {
            xhrFields:{}
        }
	};

    const myRequest = new Request(testURL, myInit);
    
        fetch(myRequest)
          .then( (response) => {
            console.log("response", response);
            this.setState({
              fetchUser: response.data
            });
            console.log("fetchUser", this.state.fetchUser)
          })
          .catch( (error) => {
            console.log(error)
          });
        
    }
 

render() {
    
    return (
      <div>
        <p>You clicked {this.fetchUser.count} times</p>
        <button onClick={this.fetchUser}>
          Click me
        </button>
      </div>
    );
  }
}
  export default Middle;
