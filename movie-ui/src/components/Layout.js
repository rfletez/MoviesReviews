import { Outlet } from 'react-router-dom';

//rafc command -> boilerplate code for the component

import React from 'react'

const Layout = () => {
    return (
        <main>
            <Outlet />
        </main>
    )
}

export default Layout