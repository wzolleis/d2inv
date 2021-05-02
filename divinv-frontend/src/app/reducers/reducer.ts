import {combineReducers} from "redux";
import {fetchReducer} from "./fetchReducer";
import {gearReducer} from "../../gear/reducers/gearReducer"


export const itemReducer = combineReducers({
    gearState: gearReducer
})


export const rootReducer = combineReducers({
    fetchState: fetchReducer,
    itemState: itemReducer
})


