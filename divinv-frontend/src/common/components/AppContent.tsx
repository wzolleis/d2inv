import React from "react";
import {Route, Switch } from "react-router-dom";
import {Home} from "./Home";

export const AppContent = () => {
    return (
        <div className='content'>
            <Switch>
                <Route exact={true} path="/"><Home/></Route>
            </Switch>
        </div>
    )
}