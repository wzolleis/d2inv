import {combineReducers} from "redux";
import {fetchReducer} from "./fetchReducer";
import {itemReducer} from "../../items/reducers/itemReducer";


export const reducers = combineReducers({
    itemState: itemReducer
})


export const rootReducer = combineReducers({
    fetchState: fetchReducer,
    itemState: reducers
})


