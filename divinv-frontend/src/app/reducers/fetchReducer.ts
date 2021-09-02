// Use the initialState as a default value
import {AnyAction, isType} from "typescript-fsa";
import {FetchItemAction} from "../actions/appActions";
import {FetchState} from "../types/appTypes";
import {initialFetchState} from "../state/initialState";

export const fetchReducer = (state: FetchState = initialFetchState, action: AnyAction) => {
    if (isType(action, FetchItemAction.started)) {
        return {
            ...state,
            fetching: true
        }
    }
    else if (isType(action, FetchItemAction.done || FetchItemAction.failed)) {
        return {
            ...state,
            fetching: false
        }
    }
    return state
}
