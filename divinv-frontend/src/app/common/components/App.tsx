import React from 'react';
import {
    BrowserRouter as Router,
    Switch,
    Route,
    NavLink
} from "react-router-dom";
import {InventoryComponent} from "../../inventory/components/InventoryComponent";
import {Home} from "./HomeComponent";

export const App = () => {
    return (
        <Router>
            <div>
                <h1>Division 2 Inventory</h1>
                <nav>
                    <ul className='header'>
                        <li>
                            <NavLink exact={true} to="/">Home</NavLink>
                        </li>
                        <li>
                            <NavLink to="/inventory">Inventory</NavLink>
                        </li>
                    </ul>
                </nav>
                <div className='content'>
                    <Switch>
                        <Route exact={true} path="/inventory"><InventoryComponent/></Route>
                        <Route exact={true} path="/"><Home/></Route>
                    </Switch>
                </div>
            </div>
        </Router>
    );
}

export default App;
