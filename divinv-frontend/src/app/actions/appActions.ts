import actionCreatorFactory, {AnyAction} from 'typescript-fsa';
import {Dispatch} from "redux";

export const actionCreator = actionCreatorFactory();

const FETCH_GEAR_ACTION = 'FETCH_GEAR'

export const FetchGearAction = actionCreator.async<{},   // parameter type
    { gear: Gear[] },   // success type
    { error: Error }   // error type
    >(FETCH_GEAR_ACTION);

export const fetchGear = () => {
    return (dispatch: Dispatch<AnyAction>) => {
        dispatch(FetchGearAction.started)
        dispatch(FetchGearAction.done)
    }
}