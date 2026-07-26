import { useState } from "react";

function CurrencyConvertor(){

    const [amount,setAmount]=useState("");

    const [currency,setCurrency]=useState("");

    function handleSubmit(e){

        e.preventDefault();

        const result=amount*80;

        alert("Converting to Euro Amount is "+result);

    }

    return(

        <form onSubmit={handleSubmit}>

            <h1 style={{color:"green"}}>

                Currency Convertor!!!

            </h1>

            Amount :

            <input

                value={amount}

                onChange={(e)=>setAmount(e.target.value)}

            />

            <br/><br/>

            Currency :

            <input

                value={currency}

                onChange={(e)=>setCurrency(e.target.value)}

            />

            <br/><br/>

            <button>

                Submit

            </button>

        </form>

    );

}

export default CurrencyConvertor;