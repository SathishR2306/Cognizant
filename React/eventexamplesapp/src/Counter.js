import { useState } from "react";

function Counter(){

    const [count,setCount]=useState(0);

    function increment(){

        setCount(count+1);

        sayHello();

    }

    function decrement(){

        setCount(count-1);

    }

    function sayHello(){

        alert("Hello! Member!");

    }

    function welcome(message){

        alert(message);

    }

    function clickMe(){

        alert("I was clicked");

    }

    return(

        <div>

            <h2>{count}</h2>

            <button onClick={increment}>Increment</button>

            <br/>

            <button onClick={decrement}>Decrement</button>

            <br/>

            <button onClick={()=>welcome("Welcome")}>
                Say Welcome
            </button>

            <br/>

            <button onClick={clickMe}>
                Click on me
            </button>

        </div>

    );

}

export default Counter;