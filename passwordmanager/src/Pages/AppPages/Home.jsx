import {Outlet} from "react-router-dom";
import "./../styling/HomePage.css"
import secure from "../pics/secure.jpeg"

import {Footer} from "./Footer";



export const Home =()=>{
    return(
        <>
            <div className="Home">
                <div className="content">
                    <h2 className="head">Say goodbye to forgetting passwords</h2>
                    <h3 className="sub-head">
                        <span className="span-1">Make life</span> <br/>
                        <span className="span-1" >simple & safe</span>
                    </h3>
                </div>
                <div className="image">
                    <img src={secure}  alt={" Security pic"} />
                </div>
            </div>
            <Outlet />
            <Footer/>
        </>
    );
}