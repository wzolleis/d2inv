import actionCreatorFactory, {AnyAction} from 'typescript-fsa';
import {Dispatch} from "redux";

export const actionCreator = actionCreatorFactory();

const FETCH_ITEMS_ACTION = 'FETCH_ITEMS'

export const FetchItemAction = actionCreator.async<{},   // parameter type
    { gear: Item[] },   // success type
    { error: Error }   // error type
    >(FETCH_ITEMS_ACTION);

export const fetchItems = () => {
    return (dispatch: Dispatch<AnyAction>) => {
        dispatch(FetchItemAction.started)
        dispatch(FetchItemAction.done)
    }
}