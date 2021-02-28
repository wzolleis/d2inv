import React from 'react';
import {render, screen} from '@testing-library/react';
import {Basic} from "./App.stories";

test('renders without crash', () => {
    render(<Basic/>);
    const linkElement = screen.getByText(/home/i);
    expect(linkElement).toBeInTheDocument();
});
