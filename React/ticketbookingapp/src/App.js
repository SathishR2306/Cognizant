import {useState} from "react";

import Guest from "./Guest";
import User from "./User";

import LoginButton from "./LoginButton";
import LogoutButton from "./LogoutButton";

function App(){

  const [loggedIn,setLoggedIn]=useState(false);

  return(

      <div>

        {

          loggedIn

              ?

              <>

                <User/>

                <LogoutButton

                    logout={()=>setLoggedIn(false)}

                />

              </>

              :

              <>

                <Guest/>

                <LoginButton

                    login={()=>setLoggedIn(true)}

                />

              </>

        }

      </div>

  );

}

export default App;