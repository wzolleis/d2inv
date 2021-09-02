// Use the initialState as a default value
import {AnyAction, isType} from "typescript-fsa";
import {ItemState} from "../../app/types/appTypes";
import {initialItemState} from "../../app/state/initialState";
import {FetchItemAction} from "../../app/actions/appActions";

export const itemReducer = (state: ItemState = initialItemState, action: AnyAction) => {
    if (isType(action, FetchItemAction.done)) {
        return {
            ...state,
            gears: []
        }
    }
    if (isType(action, FetchItemAction.done)) {
        return {
            ...state,
            gears: action.payload.result
        }
    } else if (isType(action, FetchItemAction.failed)) {
        return {
            ...state,
            gears: []
        }
    }
    return state
}
