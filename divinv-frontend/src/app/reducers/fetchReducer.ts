// Use the initialState as a default value
import {AnyAction, isType} from "typescript-fsa";
import {FetchGearAction} from "../actions/appActions";
import {FetchState} from "../types/appTypes";
import {initialFetchState} from "../state/initialState";

export const fetchReducer = (state: FetchState = initialFetchState, action: AnyAction) => {
    if (isType(action, FetchGearAction.started)) {
        return {
            ...state,
            fetching: true
        }
    }
    else if (isType(action, FetchGearAction.done || FetchGearAction.failed)) {
        return {
            ...state,
            fetching: false
        }
    }
    return state
}
