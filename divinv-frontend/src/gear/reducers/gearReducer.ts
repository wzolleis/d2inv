// Use the initialState as a default value
import {AnyAction, isType} from "typescript-fsa";
import {GearState} from "../../app/types/appTypes";
import {initialGearState} from "../../app/state/initialState";
import {FetchGearAction} from "../../app/actions/appActions";

export const gearReducer = (state: GearState = initialGearState, action: AnyAction) => {
    if (isType(action, FetchGearAction.done)) {
        return {
            ...state,
            gears: []
        }
    }
    if (isType(action, FetchGearAction.done)) {
        return {
            ...state,
            gears: action.payload.result
        }
    } else if (isType(action, FetchGearAction.failed)) {
        return {
            ...state,
            gears: []
        }
    }
    return state
}
