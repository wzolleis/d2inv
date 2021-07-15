import React from 'react'
import {render, screen} from '@testing-library/react';
import {Home} from "./Home";

test('renders without crash', () => {
    render(<Home/>);
    const linkElement = screen.getByText(/hi/i);
    expect(linkElement).toBeInTheDocument();
});
